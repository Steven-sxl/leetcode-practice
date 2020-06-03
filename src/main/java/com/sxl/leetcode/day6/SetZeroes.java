package com.sxl.leetcode.day6;

import java.util.Arrays;

/**
 * 零矩阵
 * 编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。
 * 输入：
 * [
 *   [1,1,1],
 *   [1,0,1],
 *   [1,1,1]
 * ]
 * 输出：
 * [
 *   [1,0,1],
 *   [0,0,0],
 *   [1,0,1]
 * ]
 */
public class SetZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeros1(matrix);
    }

    //方法一：
     public static void setZeros1(int[][] matrix){
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];
        for (int i= 0;i<matrix.length;i++){
            for (int j =0;j<matrix[0].length;j++){
                if (matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        //把行置为 0
        for (int i =0;i<matrix.length;i++){
            if (row[i]){
                for (int j =0;j<matrix[0].length;j++){
                    matrix[i][j]= 0;
                }
            }
        }
        //把行置为 0
        for (int i=0;i<matrix[0].length;i++){
            if (col[i]){
                for (int j =0;j<matrix.length;j++){
                    matrix[j][i]=0;
                }
            }
        }
         System.out.println(Arrays.deepToString(matrix));
     }
}
