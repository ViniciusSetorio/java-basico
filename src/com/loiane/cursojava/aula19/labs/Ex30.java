package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o elemento " + i + " do vetor A:");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[i] = vetorA[i];
            }
        }

        for (int i = 0; i < vetorB.length; i++) {
            if (vetorA[i] % 2 != 0) {
                vetorC[i] = vetorA[i];
            }
        }

        System.out.print("Vetor A = ");
        for (int element: vetorA) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.print("Vetor B = ");
        for (int element: vetorB) {
            if (element != 0) {
                System.out.print(element + " ");
            }
        }

        System.out.println();
        System.out.print("Vetor C = ");
        for (int element: vetorC) {
            if (element != 0) {
                System.out.print(element + " ");
            }
        }
    }
}