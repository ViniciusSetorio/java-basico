package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o elemento " + i + " do vetor:");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0) {
                vetorB[i] = 1;
            } else {
                vetorB[i] = 0;
            }
        }

        System.out.print("Vetor A = ");
        for (int element: vetorA) {
            System.out.println(element + " ");
        }

        System.out.print("Vetor B = ");
        for (int element: vetorB) {
            System.out.println(element + " ");
        }
    }
}