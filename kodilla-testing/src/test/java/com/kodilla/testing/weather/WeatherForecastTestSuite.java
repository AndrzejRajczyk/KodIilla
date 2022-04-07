package com.kodilla.testing.weather;

import com.kodilla.testing.weather.mock.Temperatures;
import com.kodilla.testing.weather.mock.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@DisplayName("TDD: Mock WeatherForecast Test ....")

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTest() {
        System.out.println("All WeatherForecast Test begin....");
    }

    @AfterAll
    public static void afterAllTest() {
        System.out.println("All WeatherForecast test ended....");
    }

    @BeforeEach
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Begining test no: " + testCounter);
    }

    @AfterEach

    public void afterEachTest() {
        System.out.println("End of test no :" + testCounter);
    }

    @Mock
    private Temperatures temperaturesMock;

    @Nested
    @DisplayName("Tests for CalculateForecast ")

    class TestCalculateForecastWithMock{
        @Test
    void testCalculateForecastWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    }


    @Nested
    @DisplayName("Tests AverageTemperature")
    class TestAverageTemperatureWithMock {
        @Test
        void testAverageTemperatureWithMock() {
            //Given
            Map<String, Double> temperaturesMap = new HashMap<>();
            temperaturesMap.put("Rzeszow", 25.5);
            temperaturesMap.put("Krakow", 26.2);
            temperaturesMap.put("Wroclaw", 24.8);
            temperaturesMap.put("Warszawa", 25.2);
            temperaturesMap.put("Gdansk", 26.1);
            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            double averageTempeature = weatherForecast.calculateAverageTempeature();
            System.out.println("Average Temp = " + averageTempeature + " expected=25.56");
            //Then
            Assertions.assertEquals(25.56, averageTempeature);
        }


        @Test
        void testMedianTemperatureWithMock1() {
            //Given
            Map<String, Double> temperaturesMap = new HashMap<>();
            temperaturesMap.put("Rzeszow", 25.5);
            temperaturesMap.put("Krakow", 26.2);
            temperaturesMap.put("Wroclaw", 24.8);
            temperaturesMap.put("Warszawa", 25.2);
            temperaturesMap.put("Gdansk", 26.1);
            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
            //When

            double median = weatherForecast.calculateMedianTemperature();
            //Then
            Assertions.assertEquals(25.5, median);

        }

        @Test
        void testMedianTemperatureWithMock2() {
            //Given
            Map<String, Double> temperaturesMap = new HashMap<>();
            temperaturesMap.put("Rzeszow", 25.5);
            temperaturesMap.put("Krakow", 26.2);
            temperaturesMap.put("Warszawa", 25.2);
            temperaturesMap.put("Gdansk", 26.1);
            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
            //When

            double median = weatherForecast.calculateMedianTemperature();

            //Then
            Assertions.assertEquals(25.8, median);

        }

        @Test
        void testMedianTemperatureWithMock3() {
            //Given
            Map<String, Double> temperaturesMap = new HashMap<>();
            temperaturesMap.put("Rzeszow", 25.5);

            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
            //When

            double median = weatherForecast.calculateMedianTemperature();

            //Then
            Assertions.assertEquals(25.5, median);

        }
    }
}
