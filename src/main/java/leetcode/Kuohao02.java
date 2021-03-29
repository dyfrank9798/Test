package leetcode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author zhangrongchuan
 * @data 2021-01-2021/1/19-16:25
 * @Description
 */
public class Kuohao02 {
    public static void main(String[] args) {
        Kuohao02 k = new Kuohao02();
        String str= "((";
//        str="({)}";
        System.out.println(k.checkString(str));
    }
    private boolean checkString(String target){
        int n = target.length();
        if(n  % 2 == 1){
            return false;
        }
        HashMap<Character,Character> map = new HashMap();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Deque<Character>  stack = new LinkedList();
        for( int i=0;i<target.length();i++){
            Character ch = target.charAt(i);
            if(map.containsKey(ch)){
                if(stack .isEmpty() || stack.peek() != map.get(ch)){
                    return false;
                }
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        return true;
    }
}
