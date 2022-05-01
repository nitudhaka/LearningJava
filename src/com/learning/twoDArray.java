package com.learning;

/**
 * Created by ndhaka on 5/1/2022 1:27 PM
 */
public class twoDArray {
    public static void main(String[] args) {
        int[][] arr ={{5,1,3},{4,6,2},{10,9,11}};
        boolean found = search(arr,3,3,9);
        System.out.println(found);
    }
    static boolean search(int[][] arr,int m, int n,int target){
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(target==arr[i][j]){
                    return true;
                }
            }
        }
        return  false;
    }
}
