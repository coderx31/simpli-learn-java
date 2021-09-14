package com.coderx;

public class ArrayDemo {
    public static void main(String[] args) {
//        int[] anArr;
//
//        anArr = new int[10]; // setting the size
//
//        anArr[0] = 100; // initialize the first element to 0 index as 100
//        // so on
//        anArr[1] = 200;
//        anArr[2] = 300;
//        anArr[3] = 400;
//        anArr[4] = 500;
//        anArr[5] = 600;
//        anArr[6] = 700;
//        anArr[7] = 800;
//        anArr[8] = 900;
//        anArr[9] = 1000;

        int[][] arr1 = {{1,2,3,4}, {5,6,7,8}};
        int[][] arr2 = {{1,1,1,1}, {1,1,1,1}};
        int[][] ans = new int[2][4];

//        // adding both matrices
//        for(int i=0; i<2; i++){
//            for(int j=0; j<4; j++){
//                ans[i][j] = arr1[i][j] + arr2[i][j];
//            }
//        }
//
//        //printing the new array
//        for(int i=0; i<2; i++){
//            for(int j=0; j<4; j++){
//                System.out.print(ans[i][j] + " ");
//            }
//            System.out.println();
//        }

        // matrix 1 multiply by 5
        for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                ans[i][j] = 5 * arr1[i][j];
            }
        }

        // print the answer
        for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
//        for(int i=0; i<2; i++){
//            for(int j=0; j<4; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        // 2D arrays are useful when trying to calculation with matrix
        // 2 * 4 = 8 numbers elements can be added to the array
    }
}
