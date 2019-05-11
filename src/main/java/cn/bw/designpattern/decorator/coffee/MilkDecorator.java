package cn.bw.designpattern.decorator.coffee;

/**
 * @description: concrete decorators
 * @auther: bian.wu
 * @date: 2019/5/11 16:38
 */
class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1d;
    }

    @Override
    public int makeMoreSweet() {
        return super.makeMoreSweet() + 1;
    }
}