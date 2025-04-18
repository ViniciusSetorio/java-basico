package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o valor de A do índice " + i + ": ");
            A[i] = scan.nextInt();
        }

        System.out.println("Elementos de A que são pares: ");
        for (int element : A) {
            if (element % 2 == 0) {
                System.out.print(element + " ");
            }
        }
    }
}