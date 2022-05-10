package com.learning;

import java.util.Arrays;

/**
 * Created by ndhaka on 5/6/2022 10:06 PM
 */
public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,6,8,9,11,15,21,34};
        int[] arr1 = {2,3,3,3,3,3,7,8,9};

//        System.out.println(binarySearchCode(arr,21));
//        System.out.println(Arrays.binarySearch(arr,22));
//        System.out.println(firstOccurance(arr1,3));
//        System.out.println(lastOccurance(arr1,3));
        int[] arr2 = {-10,-5,0,3,7};
                System.out.println(fixedPoint(arr2));
    }

   static int binarySearchCode(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        while (start<=end) {
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start+end)/2;
        }
        return -1;
    }

    static int firstOccurance(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        int ans = -1;
        while (start<=end) {
            if (arr[mid] == target) {
                ans = mid;
                end = mid-1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target){
                start = mid + 1;
            }
            mid = (start+end)/2;
        }
        return ans;
    }

    static int lastOccurance(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        int ans = -1;
        while (start<=end) {
            if (arr[mid] == target) {
                ans = mid;
                start = mid+1;

            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if(arr[mid]<target){
                start = mid + 1;
            }
            mid = (start+end)/2;
        }
        return ans;
    }

    static  int fixedPoint(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int mid = start/2+end/2;
//        int target = mid;
        while (start<=end) {
            if (arr[mid] == mid) {
                return mid;
            }
            if (arr[mid] > mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start/2+end/2;

        }
        return -1;
    }

    static int totalOccurance(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        int ans = -1;
        while (start<=end) {
            if (arr[mid] == target) {
                ans = mid;
                start = mid+1;

            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if(arr[mid]<target){
                start = mid + 1;
            }
            mid = (start+end)/2;
        }
        return ans;
    }
}
