package com.sxl.leetcode.day2;

import java.util.HashMap;
import java.util.Map;

/**
 * Date: 2020/4/28 14:47
 * Author: sxl
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 * 输入: s = "leetcode"
 * 输出: false
 *
 * 输入: s = "abc"
 * 输出: true
 * 0 <= len(s) <= 100
 * 尽量不实用额外的数据结构
 */
public class IsUnique {
    public static void main(String[] args) {
        String s = "abcdef";
        System.out.println(isUnique2(s));

    }

    //解法1：String的indexOf lastIndexOf
    public static boolean isUnique(String s){
        char[] chs = s.toCharArray();
        for(char ch : chs){
            if (s.indexOf(ch) != s.lastIndexOf(ch)){
                System.out.println(s.indexOf(ch)+"-"+s.lastIndexOf(ch));
                return false;
            }
        }
        return true;
    }

    //解法2：使用额外的数据结构Map
    public static boolean isUnique2(String s){
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        for (int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if (map.containsKey(ch)){
                return false;
            }else{
                map.put(ch,1);
            }
        }
        return true;
    }
}
