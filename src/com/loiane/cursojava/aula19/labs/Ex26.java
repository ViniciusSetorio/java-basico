package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o elemento " + i + " do vetor A:");
            vetorA[i] = scan.nextInt();

            System.out.println("Entre com o elemento " + i + " do vetor B:");
            vetorB[i] = scan.nextInt();

            if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;

            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;

            } else {
                vetorC[i] = -1;
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

        System.out.println();
        System.out.print("Vetor C = ");
        for (int element: vetorC) {
            System.out.print(element + " ");
        }
    }
}