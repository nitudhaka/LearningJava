package com.learning;

/**
 * Created by ndhaka on 5/8/2022 11:22 PM
 */
public class binarySearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,6,8,9,11,15,21,22,25,25,26,28,30};
        System.out.println(findInInfinteArray(arr,28));
    }
    static  int findInInfinteArray(int[] arr,int target){
        boolean found = false;
        int start = 0;
        int end = 1;
        int arrLength=2,mid=0;
        while (!found){
                while (start<=end){
            if (arr[mid] == target) {
                found=true;
                return mid;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start+end)/2;
        }
            arrLength = (int) Math.pow(arrLength,2);
                end = start + arrLength -1;
        }
        return -1;
    }
}
