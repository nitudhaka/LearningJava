package com.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ndhaka on 4/30/2022 2:44 PM
 */
public class maxInMinElementInArray {
    public static void main(String[] args) {
        int arr[]={6,7,3,5,98,9};
        HashMap<String,Integer> map =  maxAndMinElementInArray(arr);
        System.out.println(map.get("MIN"));
        System.out.println(map.get("MAX"));
    }
    static HashMap<String,Integer> maxAndMinElementInArray(int[] arr){
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        int min= Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min = arr[i]<min? min:arr[i];
            max = arr[i]>max? max:arr[i];
        }
        map.put("MIN",min);
        map.put("MAX",max);
        return map;
    }
}
