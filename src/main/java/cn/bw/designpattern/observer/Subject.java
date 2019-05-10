package cn.bw.designpattern.observer;

/**
 * @description: 观察者模式  主题  （发布者，被观察者）
 * @auther: bian.wu
 * @date: 2019/5/10 23:03
 */
public interface Subject {
    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();


}
