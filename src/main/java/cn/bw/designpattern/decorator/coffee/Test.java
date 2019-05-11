package cn.bw.designpattern.decorator.coffee;

/**
 * @description:
 * @auther: bian.wu
 * @date: 2019/5/11 16:33
 */
public class Test {

    public static void main(String...args){



        Coffee sugerMilkCoffe = new MilkDecorator(new SugarDecorator(new BlackCoffee()));

        double price = sugerMilkCoffe.getPrice();

//        assert(sugerMilkCoffe.getPrice() == 0d);

        System.out.println("end");
    }
}
