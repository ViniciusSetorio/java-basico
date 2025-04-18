package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int valor = 0;
        int divisor = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o valor de A do índice " + i + ": ");
            A[i] = scan.nextInt();

            if (A[i] % 2 != 0) {
                valor += A[i];
                divisor++;
            }
        }
        System.out.println("Média dos elementos de A: " + (valor / divisor));
    }
}