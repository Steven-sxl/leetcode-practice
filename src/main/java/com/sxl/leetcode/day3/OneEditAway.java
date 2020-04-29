package com.sxl.leetcode.day3;
/**
 * Date: 2020/4/29 15:54
 * Author: sxl
 *一次编辑
 * 字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。
 *
 * 输入:
 * first = "pale"
 * second = "ple"
 * 输出: True
 *
 * 输入:
 * first = "pales"
 * second = "pal"
 * 输出: False
 */
public class OneEditAway {
    public static void main(String[] args) {

        String s1 = "hadoop";
        String s2 = "hadooopp";
        String s3 = "hdaoopd";
        System.out.println(oneEditAway(s1,s3));

    }

    public static boolean oneEditAway(String s1,String s2){
       if(s1 == null || s2 ==null){
           return false;
       }
       int len1 = s1.length();
       int len2 = s2.length();
       if (Math.abs(len1 - len2) > 1) {return false;}

       if (len2> len1) {return oneEditAway(s2,s1);}

       //保持第一个比第二个长
        for (int i =0;i<len2;i++){
           if (s1.charAt(i) != s2.charAt(i)){
               // 如果是长度相同字符串，那就比较下一个，如果长度不一样，那就从该字符开始进行比较。
               return s1.substring(i+1).equals(s2.substring(len1 == len2 ? i+1:i));
           }
        }
        return true;
    }
}
