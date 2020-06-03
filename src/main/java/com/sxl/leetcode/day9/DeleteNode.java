package com.sxl.leetcode.day9;

/*
 *@Author:xlshi
 *@Date:2020/6/3
 *删除中间节点
 * 实现一种算法，删除单向链表中间的某个节点（即不是第一个或最后一个节点），假定你只能访问该节点。
 *
 * 输入：单向链表a->b->c->d->e->f中的节点c
 * 结果：不返回任何数据，但该链表变为a->b->d->e->f
 */
public class DeleteNode {
    public static void main(String[] args) {

    }

    public void deleteNode(ListNode node) {
        //思路：将下一个节点的值赋值给当前节点，将当前节点的下一个节点为下下一个节点
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

