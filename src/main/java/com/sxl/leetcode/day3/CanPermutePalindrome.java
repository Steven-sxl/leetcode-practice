package com.sxl.leetcode.day3;

import java.util.HashSet;
import java.util.Set;

/**
 * Date: 2020/4/29 14:21
 * Author: sxl
 *              回文排列
 * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
 * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
 * 回文串不一定是字典当中的单词。
 *
 * 输入："tactcoa"
 * 输出：true（排列有"tacocat"、"atcocta"，等等）
 */
public class CanPermutePalindrome {
    public static void main(String[] args) {
        String s="shfgshfgkc";
        System.out.println(canPermutePalindrome1(s));
        System.out.println(canPermutePalindrome2(s));
    }

    //解法1：每个字符出现的次数为偶数, 或者有且只有一个字符出现的次数为奇数时, 是回文的排列; 否则不是.
    public static boolean canPermutePalindrome1(String s){
        Set<Character> set = new HashSet<Character>();
        for (char ch : s.toCharArray()){
            if (!set.add(ch)){
                set.remove(ch);
            }
        }
        return set.size() <=1;
    }

    //解法2：不使用jdk现成的数据结构, 自己用数组实现哈希表逻辑.count记录"出现次数为奇数"的字符的个数对于当前字符c,
    // 如果之前已出现过奇数次, 则count减1; 否则count加1.
    public static boolean canPermutePalindrome2(String s){
        int[] map =new int[256];
        int count = 0;
        for (char c : s.toCharArray()){
            if ((map[c]++ & 1) == 1){
                count--;
            }else {
                count++;
            }
        }
        return count <= 1;
    }

}
