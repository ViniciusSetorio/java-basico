package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[3];
        int[] vetorEspelho = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o elemento " + i + " do vetor:");
            vetorA[i] = scan.nextInt();
        }

        for (int i = vetorA.length, j = 0; i > 0; i--, j++) {
            vetorEspelho[j] = vetorA[i-1];
        }

        System.out.print("Vetor A = ");
        for (int element: vetorA) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Vetor Espelho = ");
        for (int element: vetorEspelho) {
            System.out.print(element + " ");
        }
        if (java.util.Arrays.equals(vetorEspelho, vetorA)) {
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }
    }
}