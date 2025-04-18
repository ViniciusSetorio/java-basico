package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números inteiros:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Digite um número real:");
        double num3 = scan.nextDouble();

        double produto = (num1 * 2) * (num2 / 2);
        System.out.println("Produto do dobro do primeiro número com metade do segundo: " + produto);

        double soma = (num1 * 3) + num3;
        System.out.println("Soma do triplo do primeiro número com o terceiro: " + soma);

        double potencia = Math.pow(num3, 3);
        System.out.println("O terceiro elevado ao cubo: " + potencia);
    }
}