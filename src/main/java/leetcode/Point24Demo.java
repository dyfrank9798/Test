package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangrongchuan
 * @data 2021-01-2021/1/19-17:23
 * @Description
 * 你有 4 张写有 1 到 9 数字的牌。你需要判断是否能通过 *，/，+，-，(，) 的运算得到 24。
 *
 * 示例 1:
 *
 * 输入: [4, 1, 8, 7]
 * 输出: True
 * 解释: (8-4) * (7-1) = 24
 *
 *
 *
 * 评论版本
 *
 * 思路
 * 游戏第一步，肯定是挑出两个数，然后算出一个数，替代这两个数。
 *
 * 然后，在三个数中玩 24 点，再挑出两个数，算出一个数，替代它们。
 *
 * 然后，在两个数中玩 24 点……
 *
 * 这就有了递归的思路。每次递归都会挑出两个数，我们尝试挑出不同的两数组合：
 *
 * 挑 1、2，基于它，继续递归。
 * 挑 1、3，基于它，继续递归。
 * 挑 ……
 * 即通过 for 循环，枚举所有的两数组合（需要两层 for 循环），展开出不同选择所对应的递归分支。
 *
 * 挑出的每一对数，我们…
 * 枚举出所有可能的运算操作——（对应不同的递归调用）
 * 逐个尝试每一种运算——（选择进入一个递归分支）
 * 传入长度变小的新数组继续递归——（递归计算子问题）
 * 当递归到只剩一个数——（到达了递归树的底部），看看是不是 24 。
 * 是就返回 true——结束当前递归，并且控制它不进入别的递归分支，整个结束掉。
 * 否则返回 false，离开错误的分支，进入别的递归分支，尝试别的运算。
 * 剪枝小技巧，代码更美观
 * 当递归返回 true，代表游戏成功，此时不用继续探索了，剩下的搜索分支全部砍掉。怎么做到？
 *
 * 标识变量isValid初始为 false，默认会执行||后面的递归。代码如下。
 * 一旦某个递归返回真，isValid就变为真，由于||的短路特性，后面的递归不会执行。
 * 所有递归子调用都这么写，isValid就像一个开关，避免写很多判断语句。
 *
 * 作者：xiao_ben_zhu
 * 链接：https://leetcode-cn.com/problems/24-game/solution/ying-gai-shi-man-hao-li-jie-de-si-lu-liao-by-xiao_/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Point24Demo {

    public static void main(String[] args) {
        Point24Demo p = new Point24Demo();
        int[] nums = new int[]{4, 1, 8, 7};
        System.out.println(p.judgePoint24(nums));
    }

    public boolean judgePoint24(int[] nums) {
        List<Double> list =new ArrayList<>(4);
        for(int num : nums){
            list.add((double)num);
        }
        return solve(list);
    }

    boolean solve(List<Double> nums){
        if(nums.size() == 1){
            return Math.abs(nums.get(0) - 24) <= 0.000001;
        }
        for(int i = 0;i<nums.size();i++){
            for (int j= i+1;j< nums.size();j++){
                boolean isValid = false;
                List<Double> copy = new ArrayList<>(nums);
//                double a = copy.remove(i) , b = copy.remove(j);


                double  b = copy.remove(j),a = copy.remove(i)  ;
                copy.add(a+b);
                isValid |= solve(copy);

                copy.set(copy.size()-1,a-b);
                isValid |= solve(copy);

                copy.set(copy.size()-1,a*b);
                isValid |= solve(copy);

                copy.set(copy.size()-1,a/b);
                isValid |= solve(copy);

                copy.set(copy.size()-1,b-a);
                isValid |= solve(copy);

                copy.set(copy.size()-1,b/a);
                isValid |= solve(copy);
                if(isValid){
                    return true;
                }
            }
        }
        return false;
    }


}
