package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o valor de A do índice " + i + ": ");
            A[i] = scan.nextInt();

            B[i] = A[i] % 2;
        }

        System.out.print("A = ");
        for (int element : A) {
            System.out.print(element + " ");
        }

        System.out.print("\nB = ");
        for (double element : B) {
            System.out.print(element + " ");
        }
    }
}