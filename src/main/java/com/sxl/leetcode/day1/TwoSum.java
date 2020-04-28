package com.sxl.leetcode.day1;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Date: 2020/4/26 22:20
 * Author: sxl
 * two sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 给定一个整数数组，返回两个数字的索引，使它们加起来等于一个特定的目标。
 * 您可以假设每个输入将只有一个解决方案，并且不能两次使用相同的元素。
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 1>解法1：
 *      直接遍历比较，时间复杂度O(n^2);空间复杂度O(1)
 * 2>解法2：
 *      使用HashMap，时间复杂度O(n),空间复杂度O(n)
 */
public class TwoSum {
    public static void main(String[] args) {

        int[] nums={3,4,1,2,6,9};
        int target = 6;
        int[] res = twoSum(nums,target);
        System.out.println(Arrays.toString(res));

    }

    public static int[] twoSum(int[] nums,int target){
        int[] res = new int[2];

        if (nums == null || nums.length<=1) {return res;};
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i =0;i<nums.length;i++){
            int num = nums[i];
            int val = target - num;
            if (map.containsKey(val)){
                res[0] = i;
                res[1] = map.get(val);
                return res;
            }else {
                map.put(num,i);
            }
        }
        return res;
    }
}
