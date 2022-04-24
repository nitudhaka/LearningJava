package com.learning;

/**
 * Created by ndhaka on 4/23/2022 8:20 PM
 */
public class powerOFTwo {
    public static void main(String[] args) {
       // System.out.println(powerOfTwoByMinusOneNumber(16));
        powerOfTwo(0);
    }

    static void powerOfTwo(int n){
        int temp = n;
        int counter=0;
        while (temp>0){
             int checked =  temp & 1;
             if(checked==1){
                 counter++;
             }
            temp = temp>>1;
        }
        if(counter>1 || counter==0) {
            System.out.println(n + " is not power of 2");
        }else {
            System.out.println(n + " is power of 2");
        }
    }

    static  boolean  powerOfTwoByMinusOneNumber( int n){
        //formula is n & n-1 if result is 0 number is power of 2
        int result = n & n-1;
        if(result == 0)
            return true;
        else
            return false;
    }
}
