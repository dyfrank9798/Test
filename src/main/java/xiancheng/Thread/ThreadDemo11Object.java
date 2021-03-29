package xiancheng.Thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangrongchuan
 * @data 2020-12-2020/12/7-17:25
 * @Description
 * volatile只能保证数据的可见性，但是不能替换synchronized，保证不了原子性
 *
 */
public class ThreadDemo11Object {

    public void m(){
        System.out.println("m");
    }
    public static void main(String[] args) {
        final Object o  = new Object();
        ThreadDemo11Object t = new ThreadDemo11Object();
        synchronized (o){
            new Thread(t::m,"t1");
        }
    }
}
