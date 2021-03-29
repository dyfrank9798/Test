package leetcode;

import java.util.ArrayList;

/**
 * @author zhangrongchuan
 * @data 2021-01-2021/1/19-16:25
 * @Description
 */
public class Kuohao {
    public static void main(String[] args) {
        Kuohao k = new Kuohao();
        System.out.println(k.checkString("([)]"));
    }
    private boolean checkString(String target){
        if(target.indexOf("(") != -1){
            if(target.indexOf(")") == -1){
                return false;
            }
        }
        if(target.indexOf("{") != -1){
            if(target.indexOf("}") == -1){
                return false;
            }
        }
        if(target.indexOf("[") != -1){
            if(target.indexOf("]") == -1){
                return false;
            }
        }

        return true;
    }
}
