package com.yuyu.observerPattern1;

/**
 * Created by 彦祖 .
 */
public class StatisticsDisplay implements Observer, DisplayElement  {

    private float temperature;
    private float humidity;
    private Subject weatherData;


    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
