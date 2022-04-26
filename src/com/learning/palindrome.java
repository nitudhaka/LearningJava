package com.learning;

/**
 * Created by ndhaka on 4/26/2022 10:04 PM
 */
public class palindrome {
    public static void main(String[] args) {
//        int arr[]={1,2,2,1};
        int arr[]={1,2,3,1};
System.out.println(palindrome(arr));
    }
    static  boolean palindrome(int[] arr){
        int i=0,j=arr.length-1;
            while (i<j){
                if(arr[i]==arr[j]){
                    i++;
                    j--;
                }else {
                    return false;
                }
            }
        return  true;
    }
}
