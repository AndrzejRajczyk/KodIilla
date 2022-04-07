package com.kodilla.testing.weather.stub;

import com.kodilla.testing.weather.mock.Temperatures;
import com.kodilla.testing.weather.mock.TemperaturesStub;
import com.kodilla.testing.weather.mock.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WeatherForecastTestSuite {

    @Test
    void testCalculateForecastWithStub() {
        //Given
        Temperatures temperatures = new TemperaturesStub();                     // [1]
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);    // [2]

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
}