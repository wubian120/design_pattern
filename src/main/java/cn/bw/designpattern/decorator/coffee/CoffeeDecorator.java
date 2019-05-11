package cn.bw.designpattern.decorator.coffee;

/**
 * @description: abstract decorator
 * @auther: bian.wu
 * @date: 2019/5/11 16:38
 */

abstract class CoffeeDecorator extends Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getPrice() {
        return coffee.getPrice();
    }

    @Override
    public int makeMoreSweet() {
        return this.coffee.makeMoreSweet();
    }
}
