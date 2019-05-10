package cn.bw.designpattern.observer.气象站;

import cn.bw.designpattern.observer.Observer;

/**
 * @description: 当前天气公告牌  观察者
 * @auther: bian.wu
 * @date: 2019/5/11 00:31
 */
public class CurrentDisplay implements Observer, DisplayElement {


    private WeatherData weatherData;

    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }



    public void display() {
        System.out.println("当前温度："+ this.temperature);
        System.out.println("当前湿度："+ this.humidity);
        System.out.println("当前气压："+ this.pressure);
    }

    public void update() {
        this.temperature = weatherData.getTemperature();
        this.pressure = weatherData.getPressure();
        this.humidity = weatherData.getHumidity();
        display();
    }


}
