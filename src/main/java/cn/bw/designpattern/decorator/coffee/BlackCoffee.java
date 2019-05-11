package cn.bw.designpattern.decorator.coffee;

/**
 * @description: concrete component
 * @auther: bian.wu
 * @date: 2019/5/11 16:37
 */

public class BlackCoffee extends Coffee {

    @Override
    public int makeMoreSweet() {
        return 0;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
