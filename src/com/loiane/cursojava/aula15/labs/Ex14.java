package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com as duas notas:");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 9 && media <= 10) {
            System.out.println("Primeira nota: " + nota1 + " | Segunda nota: " + nota2);
            System.out.println("Sua média: " + media + " | conceito: A");
            System.out.println("Situação: APROVADO");

        } else if (media >= 7.5 && media < 9) {
            System.out.println("Primeira nota: " + nota1 + " | Segunda nota: " + nota2);
            System.out.println("Sua média: " + media + " | conceito: B");
            System.out.println("Situação: APROVADO");

        } else if (media >= 6 && media < 7.5) {
            System.out.println("Primeira nota: " + nota1 + " | Segunda nota: " + nota2);
            System.out.println("Sua média: " + media + " | conceito: C");
            System.out.println("Situação: APROVADO");

        } else if (media >= 4 && media < 6) {
            System.out.println("Primeira nota: " + nota1 + " | Segunda nota: " + nota2);
            System.out.println("Sua média: " + media + " | conceito: D");
            System.out.println("Situação: REPROVADO");

        } else {
            System.out.println("Primeira nota: " + nota1 + " | Segunda nota: " + nota2);
            System.out.println("Sua média: " + media + " | conceito: E");
            System.out.println("Situação: REPROVADO");
        }
    }
}