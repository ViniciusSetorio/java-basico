package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o valor de A do índice " + i + ": ");
            A[i] = scan.nextInt();

            if (A[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Percentual de pares: " + (pares * 100) / A.length);
        System.out.println("Percentual de pares: " + (impares * 100) / A.length);
    }
}