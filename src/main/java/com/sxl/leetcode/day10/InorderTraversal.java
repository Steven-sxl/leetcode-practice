package com.sxl.leetcode.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 *@Author:xlshi
 *@Date:2020/8/26
 *  94. 二叉树的中序遍历
 */
public class InorderTraversal {

    //递归,时间复杂度：O(n)。递归函数 T(n)=2⋅T(n/2)+1 ;空间复杂度：最坏情况下需要空间O(n)，平均情况为O(\log n)。
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>  list = new ArrayList<>();
        helper(root,list);
        return list;
    }
    public void helper(TreeNode root, List < Integer > res){
        if (root != null){
            if (root.left != null){
                helper(root.left,res);
            }
            res.add(root.val);
            if (root.right != null){
                helper(root.right,res);
            }
        }
    }

    //迭代（使用栈来实现),时间复杂度：O(n),空间复杂度：O(n)。
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()){
            while (curr!= null){
                stack.add(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.val);
            curr= curr.right;
        }
        return list;
    }
}
