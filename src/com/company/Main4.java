package com.company;

import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matrix = new int[10][15];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(90) + 10;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int z = 9;
        int[][] matrix_r = new int[10][15];
        for (int i = 0; i < matrix_r.length; i++) {
            int p = 14;
            for (int j = 0; j < matrix_r[i].length; j++) {
                matrix_r[i][j] = matrix[z][p];
                p--;
            }
            z--;
        }
        System.out.println();
        System.out.println("Matrix rotated in 180");
        System.out.println();
        for (int i = 0; i < matrix_r.length; i++) {
            for (int j = 0; j < matrix_r[i].length; j++) {
                System.out.print(matrix_r[i][j] + " ");
            }
            System.out.println();
        }
    }
}