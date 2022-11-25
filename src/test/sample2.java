package test;

import java.sql.SQLOutput;

public class sample2 {
    public static void main(String[] args) {
        //2,3,4,5 의 제곱을 8묶음 씩 묶어라
        int[][][] threeArray = new int[4][4][2];

        for (int i = 0; i < threeArray.length; i++) {
            int pow = 2;
            for (int j = 0; j < threeArray[i].length; j++) {
                for (int k = 0; k < threeArray[i][j].length; k++) {
                    threeArray[i][j][k] = (int) Math.pow(i + 2, pow);
                    pow++;
                }
            }
        }
        for (int[][] ints : threeArray) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    System.out.print(i + " ");
                }
                System.out.println();

            }
            System.out.println();
        }


    }
}
