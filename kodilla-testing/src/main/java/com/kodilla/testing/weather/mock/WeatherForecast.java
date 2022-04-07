package com.kodilla.testing.weather.mock;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverageTempeature() {
        List<Double> temperature = new ArrayList();
        double average = 0.0;
        for (Map.Entry<String, Double> t : temperatures.getTemperatures().entrySet()) {
            temperature.add(t.getValue());
        }

        for (int i = 0; i <= temperature.size() - 1; i++) {
            average += temperature.get(i);
        }
        average = average / temperature.size();
        return average;
    }

    public double calculateMedianTemperature() {
        List<Double> temperature = new ArrayList();
        double median = 0.0;
        for (Map.Entry<String, Double> t : temperatures.getTemperatures().entrySet()) {
            temperature.add(t.getValue());
        }

        Collections.sort(temperature);

        if (temperature.size() % 2 != 0) {

            int middle = (temperature.size() / 2);
             median =  temperature.get(middle);
            return median;
        }

        if (temperature.size() % 2 == 0) {


            double first = temperature.get((temperature.size() / 2)-1);
            double second = temperature.get((temperature.size() / 2) );
              median = (first + second) / 2;
             return median;
        }
        if (temperature.size() == 1) {

            median= temperature.get(0);
            return median;
        }
        return median;
    }
}



