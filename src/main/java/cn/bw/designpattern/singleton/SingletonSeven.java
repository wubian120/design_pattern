package cn.bw.designpattern.singleton;

/**
 * @description:
 * @auther: bian.wu
 * @date: 2019/5/14 22:50
 */
public enum SingletonSeven {

    singletonFactory;

    private Singleton instance;

    private SingletonSeven(){
        instance = new Singleton();
    }

    public Singleton getInstance(){
        return instance;
    }

    public static void main(String...args){



    }
}


class Singleton{
    public Singleton(){}
}