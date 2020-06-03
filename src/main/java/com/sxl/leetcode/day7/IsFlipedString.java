package com.sxl.leetcode.day7;

/**
 * 字符串轮转
 * 字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。
 *
 * 输入：s1 = "waterbottle", s2 = "erbottlewat"
 *  输出：True
 *
 *  输入：s1 = "aa", s2 = "aba"
 *  输出：False
 */
public class IsFlipedString {
    public static void main(String[] args) {
        String s1 = "alskdjfhg";
        String s2 = "asdfghjkl";
        String s3 = "jfhgalskd";
        System.out.println(isflipedString1(s1,s2));
        System.out.println(isflipedString2(s1,s3));
    }

    public static boolean isflipedString1(String s1,String s2){
        return s1.equals(s2) || (s1.length()==s2.length() && (s1+s1).contains(s2));
    }

    /**
     * 旋转字符串存在两倍原字符串当中，查找子串
     * @param s1
     * @param s2
     * @return
     */
    public static boolean isflipedString2(String s1,String s2){
        if (s1.length()!= s2.length() ) return false;

        s1+=s1;
        int i = 0;
        int j = 0;
        while (i != s1.length() && j != s2.length()){
            if (s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }else{
                j=0;
                i++;
            }
        }
        return j == s2.length();
    }

}
