package com.learning;

import java.util.Arrays;

/**
 * Created by ndhaka on 5/10/2022 10:31 PM
 */
public class insertionSort {
    public static void main(String[] args) {
        int arr[]={7,5,8,4,10,1};
        System.out.println(Arrays.toString(insertionSorting(arr)));
    }

    static int[] insertionSorting(int[]arr){
        int temp;
        int n = arr.length-1;
        for(int i=1;i<n;i++){
            for (int j=i+1;j>0;j--){ // this loop is for comparing
                if(arr[j]<arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j] = temp;
                }else {
                    break;
                }

            }
        }
        return  arr;
    }
}
