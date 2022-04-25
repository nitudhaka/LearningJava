package com.learning;

/**
 * Created by ndhaka on 4/24/2022 11:14 PM
 */
public class linearSearchInArray {
    static boolean findAnElementInArray( int[] arr, int targetElement){
        if(arr.length>0){
            for(int i=0;i<arr.length;i++){
                if(targetElement==arr[i]){
                    return  true;
                }
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        int[] arr = {6,8,3,14,20,61};
        System.out.println(findAnElementInArray(arr,8));
        System.out.println(findAnElementInArray(arr,9));
    }
}
