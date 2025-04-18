package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[8];
        int[] B = new int[A.length];

        int valor;
        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o valor de A do índice " + i + ": ");
            valor = scan.nextInt();
            A[i] = valor;
        }

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * 2;
        }

        for (int element: B) {
            System.out.println(element);
        }
    }
}