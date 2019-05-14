package cn.bw.designpattern.singleton;

/**
 * @description: 单例模式， 枚举实现， 不暴露枚举细节的封装。
 * @auther: bian.wu
 * @date: 2019/5/14 22:57
 */
public class SingletonFactory {


    private enum EnumSingleton{
        singletonFactory;

        private SingletonEnumFinal instance;

        private EnumSingleton(){
            instance = new SingletonEnumFinal();
        }

        public SingletonEnumFinal getInstance(){
            return instance;
        }

    }

    public static SingletonEnumFinal getInstance(){
        return EnumSingleton.singletonFactory.getInstance();
    }
}
class SingletonEnumFinal{
    public SingletonEnumFinal(){}

}