package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o elemento " + i + " do vetor A:");
            vetorA[i] = scan.nextInt();
        }

        System.out.print("Vetor A = ");
        for (int element: vetorA) {
            System.out.print(element + " ");
        }

        System.out.println();
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Tabuada de " + vetorA[i]);
            for (int j = 1; j <= 10; j++) {
                System.out.println(vetorA[i] + " x " + j + " = " + (vetorA[i] * j));
            }
            System.out.println();
        }
    }
}