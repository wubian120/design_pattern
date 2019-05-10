package cn.bw.designpattern.observer.气象站;

import cn.bw.designpattern.observer.Observer;

import java.util.List;

/**
 * @description: 未来天气公告牌  观察者
 * @auther: bian.wu
 * @date: 2019/5/11 00:32
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;
    private List<Float> forecastTemperatures;

    public ForecastDisplay(WeatherData weather){
        this.weatherData = weather;
        weatherData.registerObserver(this);
    }



    public void update() {
        this.forecastTemperatures = this.weatherData.getForecastTemperatures();
        display();
    }

    public void display() {
        System.out.println("未来几天温度");
        int count = forecastTemperatures.size();

        for(int i=0;i<count;i++){
            System.out.println("第"+i+"天:" + forecastTemperatures.get(i));
        }
    }
}
