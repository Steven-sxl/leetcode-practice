package com.sxl.leetcode.day9;

/*
 *@Author:xlshi
 *@Date:2020/6/3
 *
 * 返回倒数第 k 个节点
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
 * 输入： 1->2->3->4->5 和 k = 2
 * 输出： 4
 */
public class KthToLast {
    public static void main(String[] args) {

    }

    public int kthToLast(ListNode head, int k) {
        ListNode p = head;
        for (int i =0; i<k;i++){
            p = p.next;
        }
        while (p!=null){
            p = p.next;
            head = head.next;
        }

        return head.val;
    }
}
