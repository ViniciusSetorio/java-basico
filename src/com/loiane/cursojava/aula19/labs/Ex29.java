package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length*2];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o elemento " + i + " do vetor A:");
            vetorA[i] = scan.nextInt();
            vetorC[i] = vetorA[i];

            System.out.println("Entre com o elemento " + i + " do vetor B:");
            vetorB[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorC[vetorA.length + i] = vetorB[i];
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