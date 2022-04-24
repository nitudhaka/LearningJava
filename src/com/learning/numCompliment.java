package com.learning;

/**
 * Created by ndhaka on 4/21/2022 9:04 PM
 */
public class numCompliment {
    public static void main( String[] arg){
        negateNumber(16);
    }

    static  void  negateNumber(int n){
        int mask =0;
        while (mask<n){
            mask = (mask<<1) |1;
        }
        int ans = (~n) & mask;
        System.out.println(ans);
    }

}
