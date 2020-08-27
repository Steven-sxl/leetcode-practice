package com.sxl.leetcode.day10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 *@Author:xlshi
 *@Date:2020/8/26
 *  145. 二叉树的后序遍历
 */
public class PostorderTraversal {

    /**
     * 1.递归
     */
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null ) return list;

        if (root.left != null){
            postorderTraversal(root.left);
        }
        if (root.right != null){
            postorderTraversal(root.right);
        }
        list.add(root.val);

        return list;
    }

    /**
     * 2. 迭代
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal1(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) return  output;

        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pollLast();
            output.addFirst(node.val);
            if (node.left != null){
                stack.add(node.left);
            }
            if (node.right != null){
                stack.add(node.right);
            }
        }
        return output;
    }

    public List<Integer> postorderTraversal2(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            output.addFirst(node.val);
            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
            }
        }
        return output;
    }

}
