package cn.bw.designpattern.singleton;

/**
 * @description:  单例模式  懒汉  线程不安全
 * @auther: bian.wu
 * @date: 2019/5/14 22:27
 */
public class SingletonOne {

    private static SingletonOne instance;
    private SingletonOne(){}

    public static SingletonOne getInstance(){
        if(instance == null){
            instance = new SingletonOne();
        }
        return instance;
    }

}
