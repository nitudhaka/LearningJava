package com.learning;

/**
 * Created by ndhaka on 5/1/2022 4:48 PM
 */
public class sprial2DArray {
    public static void main(String[] args) {
//        int[][] arr ={{5,1,3},{4,6,2},{10,9,11}};
        int[][] arr ={{5,1,3,66},{4,6,2,8},{10,9,11,21}};
        int row= 3, col=4;
        int total = row *col;
        int startRow=0, endRow=2,startCol=0,endCol=3;
        while (total >=0){
             for (int i=startCol;i<=endCol;i++) {
                    if(total>=1) {
                        total--;
                    }else {
                        break;
                    }
//                System.out.print("startCol"+ i+" i ki "+i);
                System.out.print(arr[startRow][i] +"  ");
             }
            startRow++;
            for(int l=startRow;l<=endRow;l++){
                if(total>=1) {
                    total--;
                }else {
                    break;
                }
                System.out.print(arr[l][endCol] +"  ");

            }
            endCol--;
            for (int j=endCol;j>=startCol;j--) {
                if(total>=1) {
                    total--;
                }else {
                    break;
                }
                System.out.print(arr[endRow][j] +"  ");
                            }
            endRow--;
//            System.out.print(" endRow "+endRow);
//            System.out.print(" startRow "+startRow);
//            System.out.print(" startCol "+startCol);
            for(int k=endRow;k>=startRow;k--){
//                System.out.print(" startCol "+startCol + " k "+ k);
                if(total>=1) {
                    total--;
                }else {
                    break;
                }
                System.out.print(arr[k][startCol] +"  ");
            }
//            System.out.println( " total left "+ total);

            startCol++;
//            break;


        }
    }
}
