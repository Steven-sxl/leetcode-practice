package com.sxl.leetcode.day8;

import java.util.HashSet;

/*
 *@Author:xlshi
 *@Date:2020/6/2
 *  移除重复节点
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 * 输入：[1, 2, 3, 3, 2, 1]
 * 输出：[1, 2, 3]
 *
 * 输入：[1, 1, 1, 1, 2]
 * 输出：[1, 2]
 */
public class RemoveDuplicateNodes {

    public static void main(String[] args) {


    }



    /**
     * 递归
     * @param head
     * @return
     * 效率比方法二高
     */
    static HashSet<Integer> set = new HashSet<Integer>();
    public static ListNode removeDuplicateNodes1(ListNode head){

        if(head == null) return null;
        if (!set.contains(head.val)){//这个值第一次出现
            set.add(head.val);//set中加入这个值，防止再次出现
            head.next = removeDuplicateNodes1(head.next);//保留此节点，对下一个节点继续验证
            return head;
        }else {//这个值不是第一次出现

            //当前节点不要，返回对下一个节点的验证，注意这里返回的也是一个链表
            // 的一部分，返回的节点会直接挂到上次个只出现一次的节点下面。如果说
            //链表不为空，那么一定会有至少一个节点在上面，也就是满足过if条件的，
            //那么根据if中的代码，head.next就是这里返回的。
            return removeDuplicateNodes1(head.next);
        }
    }

    public static ListNode removeDuplicateNodes2(ListNode head){
        //冒泡排序的思想
        if (head == null){
            return null;
        }
        ListNode first = head;
        while (first != null){
            ListNode second = first;
            while (second.next != null){
                if (second.next.val ==first.val){
                    second.next = second.next.next;
                }else{

                    second = second.next;
                }
            }
            first = first.next;
        }
        return head;
    }
}

class ListNode{
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}