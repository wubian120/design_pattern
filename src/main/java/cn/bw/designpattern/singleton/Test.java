package cn.bw.designpattern.singleton;

/**
 * @description:
 * @auther: bian.wu
 * @date: 2019/5/14 22:54
 */
public class Test {


    public static void main(String...args){

        TestThread[] threads = new TestThread[10];

        for(int i=0;i<threads.length;i++){
            threads[i] = new TestThread();
        }

        for(TestThread tt: threads){
            tt.start();
        }

    }

}

class TestThread extends Thread{
    @Override
    public void run() {
        System.out.println(SingletonSeven.singletonFactory.getInstance().hashCode());
    }
}