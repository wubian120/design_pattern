package cn.bw.designpattern.decorator.coffee;

/**
 * @description: concrete Decorator
 * @auther: bian.wu
 * @date: 2019/5/11 16:39
 */
class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 3d;
    }

    @Override
    public int makeMoreSweet() {
        return super.makeMoreSweet() + 1;
    }
}
