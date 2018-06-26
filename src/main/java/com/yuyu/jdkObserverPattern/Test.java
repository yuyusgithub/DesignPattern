package com.yuyu.jdkObserverPattern;

/**
 * Created by 彦祖 .
 */
public class Test {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay CurrentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(23, 35, 12);
    }
}
