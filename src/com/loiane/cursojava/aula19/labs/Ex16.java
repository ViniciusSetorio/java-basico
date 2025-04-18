package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int menorQueQuinze = 0;
        int iguaisAQuinze = 0;
        int maiorQueQuinze = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o valor de A do índice " + i + ": ");
            A[i] = scan.nextInt();

            if (A[i] < 15) {
                menorQueQuinze += A[i];
            } else if (A[i] == 15) {
                iguaisAQuinze += A[i];
            } else {
                maiorQueQuinze += A[i];
            }
        }
        System.out.println("Soma menores que 15: " + menorQueQuinze);
        System.out.println("Soma iguais a 15: " + iguaisAQuinze);
        System.out.println("Soma maiores que 15: " + maiorQueQuinze);
    }
}