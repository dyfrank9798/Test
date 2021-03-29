package leetcode;

import java.util.HashMap;

/**
 * @author zhangrongchuan
 * @data 2021-01-2021/1/19-15:24
 * @Description 两数之和
 * 给定一个证书数组nums,和一个目标值target，请你在该数组中找出和为目标值的那两个数
 */
public class Lszh01 {
    public static void main(String[] args) {
        Lszh01 lszh01 =new  Lszh01();
        int[] nums = new int[]{2,11,15,7};
        int[] result =lszh01.getint(nums,9);
        for (int i = 0 ;i<result.length;i++){
            System.out.println(result[i]);
        }
    }

    private int[] getint(int[] params , int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for ( int i =0;i<params.length;i++){
            if(map.containsKey(params[i])){
                return new int[]{
                        i, map.get(params[i])
                };
            }
            map.put(target - params[i],i);
        }
        return null;
    }
}
