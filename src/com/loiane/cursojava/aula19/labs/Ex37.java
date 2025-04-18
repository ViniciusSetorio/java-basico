package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do índice " + i + ":");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = 1;

            for (int j = 1; j <= vetorA[i]; j++) {
                vetorB[i] *= j;
            }
        }

        System.out.print("Vetor A = ");
        for (double element: vetorA) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.print("Vetor B = ");
        for (double element: vetorB) {
            System.out.print(element + " ");
        }
    }
}