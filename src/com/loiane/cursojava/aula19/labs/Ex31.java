package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do índice " + i + ":");
            vetorA[i] = scan.nextInt();
        }

        int posB = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }

        System.out.print("Vetor A = ");
        for (int element: vetorA) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.print("Vetor B = ");
        for (int element: vetorB) {
            System.out.print(element + " ");
        }
    }
}