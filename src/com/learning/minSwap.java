package com.learning;

/**
 * Created by ndhaka on 5/4/2022 1:46 AM
 */
public class minSwap {
    public static void main(String[] args) {
//        int[] arr = {2,1,5,6,3};
        int[] arr = {2,7,9,5,8,6,4};
        System.out.println(slidingWindow(arr,5));
    }

    static int slidingWindow(int arr[], int k){
        int windowSize = 0;
        for(int i= 0;i<arr.length;i++){
            if(arr[i]<=k){
                windowSize++;
            }
        }
        int bad =0;
        for(int i= 0;i<windowSize;i++) {
            if(arr[i]>k){
                bad++;
            }
        }
        int ans = bad;
        for(int i= 0,j= windowSize;j<arr.length;i++,j++) {
            if(arr[i]>k){
                bad--;
            }
            if(arr[j]>k){
                bad++;
            }
            if(bad<ans){
                ans = bad;
            }
        }
        return ans;
    }
}
