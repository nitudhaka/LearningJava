package com.learning;

import java.util.Arrays;

/**
 * Created by ndhaka on 4/26/2022 9:33 PM
 */
public class SwapAlternate {
    public static void main(String[] args) {
        int arr[] ={4,7,6,9,5,3};
//        System.out.println(arr);
        swap(arr);
    }
    static void swap(int arr[]){
        int temp;
//        System.out.println(arr);
        for(int i=0;i+1<arr.length;i+=2){
            temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
        }
System.out.println(Arrays.toString(arr));
    }
}
