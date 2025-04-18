package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o elemento " + i + " do vetor A:");
            vetorA[i] = scan.nextInt();
        }

        for (int i = vetorA.length, j = 0; j < vetorB.length; i--, j++) {
            vetorB[j] = vetorA[i-1];
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