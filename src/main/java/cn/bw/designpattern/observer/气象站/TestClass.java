package cn.bw.designpattern.observer.气象站;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @auther: bian.wu
 * @date: 2019/5/11 00:34
 */
public class TestClass {


    public static void main(String...args){

        WeatherData weatherData = new WeatherData();
        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        List<Float> futures = new ArrayList<Float>();
        futures.add(22f);
        futures.add(20.3f);
        futures.add(24.5f);
        futures.add(21f);
        futures.add(29.6f);

        weatherData.setMeasures(22f,80f,1.2f,futures);

    }

}
