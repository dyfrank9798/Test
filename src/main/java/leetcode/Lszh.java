package leetcode;

import java.util.HashMap;

/**
 * @author zhangrongchuan
 * @data 2021-01-2021/1/19-15:24
 * @Description 两数之和
 * 给定一个证书数组nums,和一个目标值target，请你在该数组中找出和为目标值的那两个数
 */
public class Lszh {
    public static void main(String[] args) {
       int[] nums = new int[]{2,11,15,7};
        Lszh lszh = new Lszh();
        int[] result = lszh.twoSum(nums,9);
        for (int i = 0 ;i<result.length;i++){
            System.out.println(result[i]);
        }
        System.out.println("****************************");
        for (int i = 0 ;i<result.length;i++){
            System.out.println(nums[result[i]]);
        }
    }



    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
            System.out.println(map.toString());
        }
        return null;
    }
}
