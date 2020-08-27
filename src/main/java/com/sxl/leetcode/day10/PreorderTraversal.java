package com.sxl.leetcode.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 *@Author:xlshi
 *@Date:2020/8/25
 * 144 二叉树前序遍历
 */
public class PreorderTraversal {

    /**
     * 递归
     * @param root
     * @return
     */
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> preorderTraversal1(TreeNode root) {

        if (root == null) return list;

        list.add(root.val);
        if (root.left != null){
            preorderTraversal1(root.left);
        }
        if (root.right!=null){
            preorderTraversal1(root.right);
        }

        return list;
    }

    /**
     * 迭代
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal2(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        LinkedList<Integer> output = new LinkedList<Integer>();

        if (root == null) return output;

        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pollLast();
            output.add(node.val);
            if(node.right != null){
                stack.add(node.right);
            }
            if (node.left != null){
                stack.add(node.left);
            }
        }
        return output;
    }
}
