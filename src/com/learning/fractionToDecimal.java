package com.learning;

import java.util.HashMap;

/**
 * Created by ndhaka on 4/26/2022 1:51 AM
 */
public class fractionToDecimal {
    public static String  fractionToDecimal(int n, int d){
        String output="";
        double result= (double) n/d;
        System.out.println(result);
        String str="";
        str = str.concat(String.valueOf(result));
        String substring = str.substring(str.indexOf(".") );
//        System.out.println(substring);
        boolean same = false;
        char firstchar = substring.charAt(1);
        if(substring.length()>2) {

            for (int i = 2; i < substring.length(); i++) {
                        if(substring.charAt(i)==firstchar){
                            same = true;
                            continue;
                        }
            }

        }
        if(same){
            output =  str.substring(0,str.indexOf(".")+1) + "("+ firstchar+")";
        }else{
            output = str.substring(0,3);
        }

        return output;
    }

    public static void main(String[] args) {
//        System.out.println(fractionToDecimal(16,13));
//        System.out.println(fractionToDecimalByLearnedMethod(11,6));
//        System.out.println(fractionToDecimalByLearnedMethod(1,3));
        System.out.println(fractionToDecimalByLearnedMethod(50,6));
    }

    static String fractionToDecimalByLearnedMethod(int n, int d){
            int quo = n/d;
            int rem = n%d;
            String quoString = "";
            int tempRem = 0;
        quoString += quo;
        HashMap<Integer,Integer> map = new HashMap<>();
            if(rem==0){
                return quoString;
            }
            String frac = "";
            while (rem!=0 &&  map.containsKey(rem)==false){
                map.put(rem,frac.length());
                rem*=10;
                frac += rem/d;
                rem= rem%d;
            }
            if(rem==0){
                 quoString +="."+ frac;
            }else {
                int idx = map.get(rem);
                  quoString +="."+ frac.substring(0,idx)+"("+frac.substring(idx)+")";
            }
        return quoString;
    }
}
