package com.learning;

/**
 * Created by ndhaka on 4/25/2022 1:13 AM
 */
public class trailingZeroes {
    static int findtrailingZeroes(int N){
        // Write your code here
        System.out.println("coming here");
        int fac = factorial(N);
        int mod = 0;
        int count =0;
        while(mod<1){
            mod = fac%10;
            if(mod==0){
                count++;
            }
        }
        return count;
    }

    static int factorial( int n){
        if(n==1 || n==0){
            return n;
        }
        return n * factorial(n-1);
    }

    static  int trailingByZerosNumbers(int n){
        int power = 0;
        int deno =5;
        if(n==deno){
            power =1;
        }
        while (n>deno){
            power += n/deno;
            deno *=5;
        }
        return power;
    }

    static  int trailingZerosInNum(int n ){
        int count = 0;
        for(int i=5;n/i>=1;i*=5 ){
            count +=n/i;
        }
        return  count;
    }

    public static void main(String[] args) {
        System.out.println(trailingZerosInNum(72));
        System.out.println(trailingZerosInNum(5));
                System.out.println(trailingZerosInNum(125));

    }
}
