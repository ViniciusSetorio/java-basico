package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.##");

        int[] A = new int[10];
        int[] B = new int[A.length];
        double[] C = new double[A.length];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o valor de A do índice " + i + ": ");
            A[i] = scan.nextInt();
        }
        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o valor de B do índice " + i + ": ");
            B[i] = scan.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            C[i] = (double) A[i] / B[i];
        }

        System.out.print("A = ");
        for (int element : A) {
            System.out.print(element + " ");
        }

        System.out.print("\nB = ");
        for (int element : B) {
            System.out.print(element + " ");
        }

        System.out.print("\nC = ");
        for (double element : C) {
            System.out.print(df.format(element) + " ");
        }
    }
}