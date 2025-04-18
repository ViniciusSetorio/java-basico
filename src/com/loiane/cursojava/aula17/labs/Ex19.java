package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota;
        double soma = 0;

        System.out.println("Quantas notas deseja calcular?");
        int nNotas = scan.nextInt();

        for (int i = 0; i < nNotas; i++) {
            System.out.println("Entre com a nota:");
            nota = scan.nextInt();

            soma += nota;
        }
        double media = soma / nNotas;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}