package cn.bw.designpattern.decorator.coffee;

/**
 * @description:
 * @auther: bian.wu
 * @date: 2019/5/11 16:36
 */
/**
 * decorated 被装饰者
 * Component
 */
public abstract class Coffee {
    protected int sweet = 0;
    protected double price = 2d;

    public abstract int makeMoreSweet();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price += price;
    }
}