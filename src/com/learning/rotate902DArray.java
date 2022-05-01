package com.learning;

import java.util.Arrays;

/**
 * Created by ndhaka on 5/1/2022 3:08 PM
 */
public class rotate902DArray {
    public static void main(String[] args) {
        int[][] arr ={{5,1,3},{4,6,2},{10,9,11}};
//        int[][] result =transpose(arr,3,3);
        int[][] result =transposeByLoveB(arr,3,3);
        for (int i=0;i<result.length;i++){
            System.out.println(Arrays.toString(result[i]));
        }
//        System.out.println(Arrays.toString(result));

    }
    static int[][] transpose(int[][]arr, int row,int col){
        int [][] result = new int[row][col];
        for(int i=0;i<col;i++) {
            for (int j = 0; j < row; j++) {
                result[i][j]=arr[j][i];
            }
        }
        return  result;
    }

    static int[][] transposeByLoveB(int[][]arr, int row,int col){
        int [][] result = new int[row][col];
        for(int i=0;i<col;i++) {
            for (int j = 0; j < row; j++) {
                result[i][j]=arr[j][i];
            }
        }
        return  result;
    }

    static int[][] reverse(int[][]arr, int row,int col){

        return  arr;
    }
}
