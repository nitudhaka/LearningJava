package com.learning;

/**
 * Created by ndhaka on 4/26/2022 5:22 PM
 */
public class pascalTriangle {
    static int nCr(int n, int r){
        int result=0;
        result = factorial(n)/(factorial(n-r) *factorial(r));
    return result;
    }
    static int factorial (int n ){
        if(n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    static  void printPascal(int n){
        for(int i=0;i<n;i++){
            for (int j=0; j<=i;j++){
                System.out.print(nCr(i, j));
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printPascal(7);
    }

}
