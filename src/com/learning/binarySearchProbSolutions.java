package com.learning;

import java.util.Arrays;

/**
 * Created by ndhaka on 5/7/2022 10:19 PM
 */
public class binarySearchProbSolutions {
    public static void main(String[] args) {
        int[] arr = {2,3,6,8,9,11,15,21,34};
//        System.out.println(ceilingValue(arr,12));
//        System.out.println(floorValue(arr,12));
        char letters[] = {'c','f','j'};
//        System.out.println(closesetNextgreaterChar(letters,'j'));
        char letters1[] = {'e','e','e','e','e','e','n','n','n','n'};
//        System.out.println(closesetNextgreaterChar(letters1,'e'));
        int[] arr1 = {2,3,6,8,8,8,9,11,15,21,34};
         //       System.out.println(Arrays.toString(firstAndLastOccurence(arr1,8)));
                int[] mountain = {2,6,8,12,15,11,10,9,7,3,1};
        int[] mountain1 = {2,6,6,8,12,15,11,10,9,8,8,7,3,1};
     //   System.out.println(peakOfMountain(mountain1));
           System.out.println(guessNumber(10));
//        guessNumber(guessNumber);
    }

     static int ceilingValue(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        int mid = start+(end-start)/2;
//        int ans = Integer.MIN_VALUE;
        while (start<=end) {
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                end = mid - 1;
//                ans = arr[mid];
            }
            if (arr[mid] < target){
                start = mid + 1;
            }
            mid = start+(end-start)/2;
        }
        return start;
    }

    static int floorValue(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        int mid = start+(end-start)/2;
//        int ans = Integer.MIN_VALUE;
        while (start<=end) {
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                end = mid - 1;
//                ans = arr[mid];
            }
            if (arr[mid] < target){
                start = mid + 1;
            }
            mid = start+(end-start)/2;
        }
        return arr[end];
    }

    static char closesetNextgreaterChar(char arr[],char target){
        int start = 0;
        int end = arr.length-1;
        int mid = start+(end-start)/2;
        while (start<=end) {
            if (arr[mid] > target) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            mid = start+(end-start)/2;
        }
        if(start>= arr.length){
            start = 0;
        }
        return arr[start];
    }

    static  int[] firstAndLastOccurence(int arr[],int target){
        int[] ans = {-1,-1};
        ans[0] = search(arr,target,true);
        ans[1] = search(arr,target,false);
        return  ans;
    }
    static  int search(int arr[], int target, boolean firstIndexOccurance){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        int mid = start+(end-start)/2;
//        int ans = Integer.MIN_VALUE;
        while (start<=end) {
            if (arr[mid] > target) {
                end = mid - 1;
//                ans = arr[mid];
            }
            if (arr[mid] < target){
                start = mid + 1;
            }
            if (arr[mid] == target) {
                ans = mid;
                if(firstIndexOccurance){
                    end = mid-1;
                }else {
                    start= mid+1;
                }
            }
            mid = start+(end-start)/2;
        }

        return ans;
    }

    static int peakOfMountain(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        while (start<end) {
//            if (arr[mid] == target) {
//                return mid;
//            }
            if (arr[mid] > arr[mid+1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start+end)/2;
        }
        return arr[start];
    }

    static int guessNumber(int n) {
        int start = 1;
        int end = n;
        int arrLength=n,mid=(start+end)/2;
//        int target = guess(n);
        int target = 6;
        while (start<end){
            if (mid == target) {
                return mid;
            }
            if (mid> target) {
                end = mid - 1;
            } else {
                start = mid+1;
            }
            mid = (start+end)/2;
        }

        return mid;
    }
}
