package com.learning;

import java.util.Arrays;

/**
 * Created by ndhaka on 5/10/2022 9:54 PM
 */
public class bubbleSort {
    public static void main(String[] args) {
        int arr[]={7,5,8,4,10,1};
        System.out.println(Arrays.toString(bubbleSorting(arr)));
    }
    static  int[] bubbleSorting(int arr[]){
        int temp;
        int n = arr.length-1;
        for(int i=0;i<n;i++){ //this loop is for round
            for (int j=0;j<n-i;j++){ // this loop is for comparing
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        return  arr;
    }
}
