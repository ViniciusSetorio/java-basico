package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int soma = 0;
        double media;

        for (int i = 0; i < 5; i++) {
            System.out.println("Entre com um número:");
            num = scan.nextInt();

            soma += num;
        }
        media = soma / 5;
        System.out.println("Soma: " + soma + " | Média: " + media);
    }
}