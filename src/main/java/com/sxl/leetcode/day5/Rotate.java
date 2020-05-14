package com.sxl.leetcode.day5;

import java.util.Arrays;

/**
 * Date: 2020/5/7 15:26
 * Author: sxl
 * 旋转矩阵
 * 给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
 *  不占用额外内存空间能否做到？
 *  给定 matrix =x
 [
 [1,2,3],
 [4,5,6],
 [7,8,9]
 ],

 原地旋转输入矩阵，使其变为:
 [
 [7,4,1],
 [8,5,2],
 [9,6,3]
 ]
 */
public class Rotate {

    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotate1(matrix);

    }

    //方法1：翻转 时间复杂度：O(N^2) ；空间复杂度：O(1)
    public static void rotate1(int[][] matrix){
        int n = matrix.length;
        for(int i = 0;i<n;i++){
            for(int j = i +1;j<n;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n/2;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = tmp;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }

    //方法2
//    public static void rotate2(int[][] matrix){
//        int n = matrix.length;
//        for (int i=0;i<n/2;i++){
//            for (int j = 0;j<(n+1)/2;j++){
//                int tmp = matrix[i][j];
//                matrix[i][j] = matrix[n-j-1][i];
//                matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
//                matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
//                matrix[j][n-i-1]=tmp;
//            }
//        }
//        System.out.println(Arrays.deepToString(matrix));
//    }

    //方法2：
//    public static void rotate2(int[][] matrix){
//        int len = matrix.length;
//        int[][] tmp = new int[len][len];
//        for (int i = 0;i<len;i++){
//            for (int j=0;j<len;j++){
//                tmp[j][len-1-i] = matrix[i][j];
//            }
//        }
//        System.out.println(Arrays.deepToString(tmp));
//
//        for (int i = 0;i<len;i++){
//            System.arraycopy(tmp[i],0,matrix[i],0,len);
//        }
//
//        System.out.println(Arrays.deepToString(matrix));
//    }

}
