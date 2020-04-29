package com.sxl.leetcode.day2;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Date: 2020/4/28 15:06
 * Author: sxl
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 * 输入: s1 = "abc", s2 = "bca"
 * 输出: true
 *
 * 输入: s1 = "abc", s2 = "bad"
 * 输出: false
 */
public class CheckPermutation {
    public static void main(String[] args) {

        String s1 = "asdfgh";
        String s2 = "dsfgah";
        String s3 = "afdsjk";
        System.out.println(checkPermutation2(s1,s2));


    }

    //解法1
    public static boolean checkPermutation1(String s1,String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        char[] chs1 = s1.toCharArray();
        Arrays.sort(chs1);
        char[] chs2 = s2.toCharArray();
        Arrays.sort(chs2);
        return new String(chs1).equals(new String(chs2));
    }

    //解法2：HashMap
    public static boolean checkPermutation2(String s1,String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        HashMap<Character,Integer> map =new HashMap<Character, Integer>();
        for(char ch1 : s1.toCharArray()){
            if (map.containsKey(ch1)){
                int i = map.get(ch1);
                map.put(ch1,++i);
            }else {
                map.put(ch1,1);
            }
        }

        for (char ch2 : s2.toCharArray()){
            if (map.containsKey(ch2)){
                int i = map.get(ch2);
                map.put(ch2,--i);
                if (i<0){
                    return false;
                }
            }else {
                return false;
            }
        }
        return true;
    }
}
