package com.learning;

/**
 * Created by ndhaka on 4/28/2022 12:50 AM
 */
public class nthNaturalNum {
    public static void main(String[] args) {
        System.out.println(nthNumberAfterRemovingContainingNineDigitNumber(18));

    }

    static  boolean isDigitNine(long n){
        long rem;
        while (n>0){
            rem = n%10;
            if(rem==9){
                return  true;
            }
            n = n/10;
        }
        return  false;
    }

    static long nthNumberAfterRemovingContainingNineDigitNumber(long n){
        long counter = 0;
        long i=1;
        while (true){
            if(counter==n){
                break;
            }
            if(isDigitNine(i)==false){
                counter++;
            }
            i++;
        }
        return i-1;
    }
}
