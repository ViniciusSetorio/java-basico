package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorAleatorio = new int[10];
        int contZeros = 0;
        int contUms = 0;

        for (int i = 0; i <  vetorAleatorio.length; i++) {
            vetorAleatorio[i] = (int) Math.round(Math.random() * 1);

            System.out.print(vetorAleatorio[i] + " ");
            System.out.println();

            if (vetorAleatorio[i] == 0) {
                contZeros++;
            } else {
                contUms++;
            }
        }
        System.out.println("Número de zeros: " + (contZeros * 100) / vetorAleatorio.length + "%");
        System.out.println("Número de Ums: " + (contUms * 100) / vetorAleatorio.length + "%");
    }
}