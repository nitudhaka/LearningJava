package com.learning;

/**
 * Created by ndhaka on 5/1/2022 10:59 PM
 */
public class wave2DArray {
    public static void main(String[] args) {
                int[][] arr ={{5,1,3},{4,6,2},{10,9,11}};
//        int[][] arr ={{5,1,3,66},{4,6,2,8},{10,9,11,21}};
        int row= 3, col=4;
        int total = row *col;
        int startRow=0, endRow=2,startCol=0,endCol=2;
        for(int i=0;i<=endRow;i++){
            if(i%2==0){
//                System.out.println("endCol "+endCol);
                for(int j=0;j<=endCol;j++){
//                    System.out.println("j  "+j);
                    System.out.print(arr[i][j]+ "  ");
                }
            }else{
                for(int j=endCol;j>=0;j--){
                    System.out.print(arr[i][j]+ "  ");
                }
            }
        }
    }

}
