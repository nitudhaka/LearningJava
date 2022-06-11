package com.learning;

import java.sql.Array;
import java.util.Scanner;

/**
 * Created by ndhaka on 5/12/2022 9:39 PM
 */
public class charAndString {
    public static void main(String[] args) {
        char[] arr = {'a','b','d','f'};
//        System.out.println(getLength(arr));
//        System.out.println(reverse(arr));
        reverseString();
    }
    static int getLength(char arr[]){
        return  arr.length;
    }

    static char[] reverse(char arr[]){
        int s=0,e=arr.length-1;char temp;
        while (s<e){
         temp   = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return  arr;
    }

    static void  reverseString(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();              //reads string
        System.out.print("You have entered: "+str);
    }

    static  void  anagramString(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1= sc.nextLine();
        System.out.print("Enter second string: ");
        String str2= sc.nextLine();
        int[] freq= new int[26];
        for (int i=0;i<26;i++){

        }

    }

    static int minFlip(char[] a){
        if(a[0]=='0'){

        }
        return -1;

    }
}
