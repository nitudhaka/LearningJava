package com.learning;

/**
 * Created by ndhaka on 4/24/2022 11:51 PM
 */
public class findMissingNumbInArray {
    static  int missingNumber(int arr[], int n) {
        int sum = (n*(n+1))/2; int arrSum=0;
        for(int i = 0; i<arr.length;i++){
            arrSum +=arr[i];
        }
        return sum-arrSum;
    }

    static  int missingNumByBit(int arr[], int n){
            int xorOnArr = arr[0];
        for (int i=1; i<n-1;i++){
            xorOnArr ^= arr[i];
        }
//        System.out.println(xorOnArr);
        for (int i=1; i<=n;i++){
            xorOnArr ^= i;
        }
        return xorOnArr;
    }

    public static void main(String[] args) {
            int arr[] = {6,8,2,5,9,7,4,1};
        int missingNumb = 0;
//           missingNumb =  missingNumber(arr,9);
          missingNumb = missingNumByBit(arr,9);
        System.out.println("Missing number is "+ missingNumb);
    }
}
