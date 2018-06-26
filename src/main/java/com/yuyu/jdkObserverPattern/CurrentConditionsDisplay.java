package com.yuyu.jdkObserverPattern;

import com.yuyu.observerPattern1.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by 彦祖 .
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Observable observable;

    private float temperature;

    private float pressure;

    private float humidity;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object obj) {
        if(observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData)observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("当前温度:" + this.temperature);
        System.out.println("当期湿度:" + this.humidity);
        System.out.println("当期气压:" + this.pressure);
    }
}
