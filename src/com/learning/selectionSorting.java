package com.learning;

import java.util.Arrays;

/**
 * Created by ndhaka on 5/10/2022 9:05 PM
 */
public class selectionSorting {
    public static void main(String[] args) {
        int arr[]={7,5,8,4,10,1};
    System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static  int[] selectionSort(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }
        }
        return arr;
    }
}
