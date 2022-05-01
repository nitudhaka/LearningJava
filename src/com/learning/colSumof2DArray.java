package com.learning;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by ndhaka on 5/1/2022 2:10 PM
 */
public class colSumof2DArray {
    public static void main(String[] args) {
        int[][] arr ={{5,1,3},{4,6,2},{10,9,11}};
        int[] colMax =sumOfColumnsin2DArray(arr,3,3);
       System.out.println(Arrays.toString(colMax));

        int max =Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (colMax[i]>max){
                max = colMax[i];
            }
        }
        System.out.println("Max in col: "+max);
        colSumof2DArrayInLoveBabbarStyle(arr,3,3);
    }
    static int[]  sumOfColumnsin2DArray(int[][] arr, int row, int col){
        int[] test = new int[col];
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                test[j]+=arr[i][j];
            }
        }
    return test;
    }

    static void colSumof2DArrayInLoveBabbarStyle(int[][] arr, int row, int col){
        int maxi = 0;
        for(int i=0;i<col;i++){
            int sum=0;
            for (int j=0;j<row;j++){
                sum+=arr[j][i];

            }
            System.out.println("Column sum:"+sum);
            if(sum>maxi){
                maxi = sum;
            }

        }
        System.out.println("Column maximum sum:"+maxi);
    }
}
