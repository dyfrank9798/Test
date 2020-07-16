package xiancheng;

/**
 * 获取线程的状态
 */
public class ThreadDemo04state {

   private  static class MyThread extends Thread{
       @Override
       public void run() {
           System.out.println("线程内部");
           System.out.println(this.getState());
           for(int i =0;i<10;i++){
               System.out.println("A"+i);
               try {
                   Thread.sleep(500);
               }catch (Exception e){
                   e.printStackTrace();
               }
           }
       }
   }

    public static void main(String[] args) {
        Thread t = new MyThread();
        System.out.println("线程开始");
        System.out.println(t.getState());
        t.start();
        try{
            t.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("线程结束");
        System.out.println(t.getState());
    }
}
