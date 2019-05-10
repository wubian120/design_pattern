package cn.bw.designpattern.observer.气象站;

import cn.bw.designpattern.observer.Observer;
import cn.bw.designpattern.observer.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:   天气数据  （被观察者） concrete subject
 * @auther: bian.wu
 * @date: 2019/5/11 00:16
 */
public class WeatherData implements Subject {

    List<Observer> observers;
    /**气温*/
    private float temperature;
    /**湿度*/
    private float humidity;
    /**气压*/
    private float pressure;
    //未来几天气温
    private List<Float> forecastTemperatures;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update();
        }
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }


    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void measursChanged(){
        notifyObservers();
    }

    public void setMeasures(float temp, float humi, float press, List<Float> foreTemps){
        this.temperature = temp;
        this.humidity = humi;
        this.pressure = press;
        this.forecastTemperatures = foreTemps;
        //变动通知
        measursChanged();
    }

    //getter
    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public List<Float> getForecastTemperatures() {
        return forecastTemperatures;
    }

}
