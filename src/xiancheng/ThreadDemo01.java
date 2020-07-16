package xiancheng;

import java.util.concurrent.TimeUnit;

public class ThreadDemo01 {

    private static class T1  extends  Thread{
        public void run(){
            for(int i =0 ;i<10 ;i++){
                try {
                    TimeUnit.MICROSECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T1");
            }
        }
    }

    public static void main(String[] args) {
//        new T1().run();  //先运行完了再往后走。相当于调用方法
        new T1().start();//产生一个分支，一起往后走
        for(int i =0 ;i<10 ;i++){
            try {
                TimeUnit.MICROSECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main");
        }

    }
}
