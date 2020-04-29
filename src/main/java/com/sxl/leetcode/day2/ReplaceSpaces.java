package com.sxl.leetcode.day2;

/**
 * Date: 2020/4/28 17:46
 * Author: sxl
 * URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。（注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
 *
 * 输入："Mr John Smith    ", 13
 * 输出："Mr%20John%20Smith"
 *
 * 输入："               ", 5
 * 输出："%20%20%20%20%20"
 */
public class ReplaceSpaces {
    public static void main(String[] args) {

        String S = "A b c is a hah    ";
        int length = 14;
        System.out.println(replaceSpaces1(S,length));
        System.out.println(replaceSpaces2(S,length));

    }

    //方法1：使用String API
    public static String replaceSpaces1(String S,int length){
        return S.substring(0,length).replaceAll(" ","%20");
    }

    //方法2：
    public static String replaceSpaces2(String S,int length){
        StringBuilder sb = new StringBuilder();
        char[] chs = S.toCharArray();
        for (int i=0;i<length;i++){
            if (chs[i]==' '){
                sb.append("%20");
            }else {
                sb.append(chs[i]);
            }
        }
        return sb.toString();
    }
}
