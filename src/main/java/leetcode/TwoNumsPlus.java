package leetcode;

import lombok.Data;

/**
 @author zhangrongchuan
 @data 2021-01-2021/1/22-16:26
 @Description
 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/add-two-numbers
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 输入：l1 = [2,4,3], l2 = [5,6,4]
 输出：[7,0,8]
 解释：342 + 465 = 807.
 示例 2：
 *
 输入：l1 = [0], l2 = [0]
 输出：[0]
 示例 3：
 *
 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 输出：[8,9,9,9,0,0,0,1]
 *
 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/add-two-numbers
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoNumsPlus {

    public static void main(String[] args) {
        TwoNumsPlus t = new TwoNumsPlus();
        int[]  arrs1 = new int[]{2,4,3};
        int[]  arrs2 = new int[]{5,6,4};
        for (int i =0;i<arrs1.length;i++){
            ListNode l1 = new ListNode(arrs1[i]);
            ListNode l2 = new ListNode(arrs2[i]);
            System.out.println(t.addTwoNumbers(l1,l2).getVal());
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;
            carry = sumVal / 10;

            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        return root.next;
    }

    @Data
    public static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
}
