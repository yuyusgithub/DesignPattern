package com.yuyu.jdkObserverPattern;

import java.util.Observable;

/**
 * Created by 彦祖 .
 */
public class WeatherData extends Observable {

    private float temperatrue;

    private float humidity;

    private float pressure;

    public WeatherData() {
    }


    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public float getTemperature() {
        return temperatrue;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }


    // 天气发生变化
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperatrue = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
