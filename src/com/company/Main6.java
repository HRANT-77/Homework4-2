package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(90) +10;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // region 90
        int[][] matrix_90 = new int[5][5];
        for (int i = 0; i < matrix_90.length; i++) {
            int z_90 = 4;
            for (int j = 0; j < matrix_90[i].length; j++) {
                matrix_90[i][j] = matrix[z_90][i];
                z_90--;
            }
        }
        //endregion

        //region 180
        int z_180 = 4;
        int[][] matrix_180 = new int[5][5];
        for (int i = 0; i < matrix_180.length; i++) {
            int p_180 = 4;
            for (int j = 0; j < matrix_180[i].length; j++) {
                matrix_180[i][j] = matrix[z_180][p_180];
                p_180--;
            }
            z_180--;
        }

        //endregion

        //region 270
        int p_270 = 4;
        int[][] matrix_270 = new int[5][5];
        for (int i = 0; i < matrix_270.length; i++) {
            int z_270 = 0;
            for (int j = 0; j < matrix_270[i].length; j++) {
                matrix_270[i][j] = matrix[z_270][p_270];
                z_270++;
            }
            p_270--;
        }
        //endregion
        System.out.println();
        System.out.println("———————- MENU —————-\n" +
                "For rotating 90*   input 1\n" +
                "For rotating 180*  input 2\n" +
                "For rotating 270*  input 3\n" +
                "For Exit           input 4\n" +
                "————————————————");
        do {
            System.out.println();
            int num = scanner.nextInt();
            if (num == 1) {
                System.out.println("Matrix rotated in 90");
                for (int i = 0; i < matrix_90.length; i++) {
                    for (int j = 0; j < matrix_90[i].length; j++) {
                        System.out.print(matrix_90[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            if (num == 2) {
                System.out.println();
                System.out.println("Matrix rotated in 180");
                System.out.println();
                for (int i = 0; i < matrix_180.length; i++) {
                    for (int j = 0; j < matrix_180[i].length; j++) {
                        System.out.print(matrix_180[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            if (num == 3) {
                System.out.println();
                System.out.println("Matrix rotated in 270");
                System.out.println();
                for (int i = 0; i < matrix_270.length; i++) {
                    for (int j = 0; j < matrix_270[i].length; j++) {
                        System.out.print(matrix_270[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            if (num != 4 && num != 1 && num != 2 && num != 3) {
                System.out.println("Wrong number, please try again");
            }
            if (num == 4) {
                break;
            }
        }
        while (true);
    }
}