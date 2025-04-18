package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int menorIdade = A[0];
        int maiorIdade = A[0];
        int menorIndice = 0;
        int maiorIndice = 0;

        for (int i = 1; i < A.length; i++) {
            System.out.println("Digite o valor de A do índice " + i + ": ");
            A[i] = scan.nextInt();

            if (menorIdade > A[i]) {
                menorIdade = A[i];
                menorIndice = i;

            } else if (maiorIdade < A[i]) {
                maiorIdade = A[i];
                maiorIndice = i;
            }
        }
        System.out.println("Menor idade do vetor: " + menorIdade + " | Índice: " + menorIndice);
        System.out.println("Maior idade do vetor: " + maiorIdade + " | Índice: " + maiorIndice);
    }
}