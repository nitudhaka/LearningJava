package com.learning;

import java.util.Arrays;

/**
 * Created by ndhaka on 4/26/2022 9:26 PM
 */
public class maxInArray {
    static  int maximumNumberInArray(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={6,8,9,4,14};
        int max = maximumNumberInArray(arr);
        System.out.println(max);
    }
}
