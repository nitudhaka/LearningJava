package com.learning;

import java.util.Arrays;

/**
 * Created by ndhaka on 4/30/2022 2:06 PM
 */
public class reverseArray {
    static int[] reverseArrayReturn(int arr[]){
        int arrLength = arr.length;
        int[] result = new int[arrLength]; int j=0;
        for (int i=arr.length-1;i>=0;i--){
            result[j] = arr[i];
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={6,7,3,5,98,9};
        int[] reverseArray = reverseArrayReturn(arr);
        System.out.println(Arrays.toString(reverseArray));
    }
}
