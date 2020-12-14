package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[10][15];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(90) + 10;
            }
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Input number of row ");
        int k = scanner.nextInt();
        if(k<11) {
            for (int i = 0; i < 15; i++) {
                sum += matrix[k - 1][i];
            }
            System.out.println("Sum elements in " + k + " row is " + sum);
        }
        else{
            System.out.println("Number of row can be under 11");
        }
    }
}

