package com.sxl.leetcode.day4;

/**
 * Date: 2020/5/6 16:50
 * Author: sxl
 *
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
 * 比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。
 * 你可以假设字符串中只包含大小写英文字母（a至z）。
 *
 * 输入："aabcccccaaa"
 * 输出："a2b1c5a3"
 *
 * 输入："abbccd"
 * 输出："abbccd"
 * 解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。
 */
public class CompressString {
    public static void main(String[] args) {

        String s = "aaaabbbbbbaacdefaa";
        System.out.println(compressString(s));

    }

    public static String compressString(String s){
        int len = s.length();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < len){
            int j = i;
            while (j< len && s.charAt(i) == s.charAt(j)){
                j++;
            }
            sb.append(s.charAt(i));
            sb.append(j-i);
            i = j;
        }

        String res = sb.toString();
        if (res.length() < s.length()){
            return res;
        }else {
            return s;
        }
    }
}
