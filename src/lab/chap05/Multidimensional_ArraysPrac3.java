package lab.chap05;

import java.util.Arrays;

public class Multidimensional_ArraysPrac3 {
    public static void main(String[] args) {

        int[][][] arr = new int[12][5][7];

        for (int k = 0; k < arr.length; k++) {
            int num = 1;
            System.out.println("\t\t\t" + (k + 1) + "월"); // 월 출력
            for (int i = 0; i < arr[k].length; i++) {
                for (int j = 0; j < arr[k][i].length; j++) {
                    arr[k][i][j] = num++;
                }
            }
        }
    }
}