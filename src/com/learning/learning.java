package com.learning;

/**
 * Created by ndhaka on 4/2/2022 8:51 PM
 */
public class learning {
    static int i=1;
    public static void main (String[] arg){
        char ch = 'a';
        int i = (int)ch;
        int five = 5;
//        changeValue(i);
//        System.out.println("Testing "+ !five);
//        System.out.println(" "+i);
//        hallowPyramid(16);
        invertedPyramid(6);
        pyramid(6);
    }
    static  void  hallowPyramid(int n){
        for(int row=1;row<=n;row++){
            if(row==1|| row==n){
                for (int col=1;col<=n-row+1;col++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for(int col=1;col<=n-row-1;col++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    static  void invertedPyramid(int n){
        for(int row =1;row<=n;row++){
            for(int col=1; col<=row-1;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    static  void pyramid(int n){
            for(int row =1;row<=n;row++){
                for(int col=1; col<=n- row;col++){
                    System.out.print(" ");
                }
                for(int col=1;col<=row;col++){
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
    }

    static void  leftSideHalfPyramid(int n ){
        for (int row =1; row <=n; row++) {
            for (int col = row; col <=row-1; col++) {
                        System.out.print("  ");

            }
            for(int col=1;col<=n-row+1;col++) {
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }

    static  void  lastHalfPyramid(int n) {
        for (int row = 1; row <n; row++) {

            for (int col = row; col >= 1; col--) {
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }

    static void halfPyramid(int n){
        for (int row=1;row<=n;row++){

            for (int col=1;col<=row;col++){
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }

    static void  printPattern(int n ){

        for(int row=0; row<n;row++){
            for (int col=0;col<n; col++) {
                System.out.print(" * ");
            }
            System.out.println("\n");
        }

    }
}
