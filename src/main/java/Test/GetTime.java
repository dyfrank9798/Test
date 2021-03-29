package Test;

import java.util.Date;

/**
 * @author zhangrongchuan
 * @data 2020-12-2020/12/17-16:53
 * @Description
 */
public class GetTime {
    public static void main(String[] args) {
        Date date = new Date();
        Long str = date.getTime();
        System.out.println("0"+date.getTime());
        System.out.println(str.toString().length());
    }
}
