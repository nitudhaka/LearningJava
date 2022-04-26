package com.learning;

/**
 * Created by ndhaka on 4/26/2022 1:51 AM
 */
public class fractionToDecimal {
    public static String  fractionToDecimal(int n, int d)
    {
        double result= (double) n/d;

        System.out.println(result);
        String str="";
        str = str.concat(String.valueOf(result));
//        str.chars().
        return str;
    }

    public static void main(String[] args) {
        System.out.println(fractionToDecimal(1,3));
    }
}
