package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[A.length];

        int valor;
        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o valor de A do índice " + i + ": ");
            valor = scan.nextInt();
            A[i] = valor;
            B[i] = A[i];
        }

        for (int element: B) {
            System.out.print(element + " ");
        }
    }
}