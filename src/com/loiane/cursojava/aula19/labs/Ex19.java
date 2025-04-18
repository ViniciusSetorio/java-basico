package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] nota1 = new double[10];
        double[] nota2 = new double[nota1.length];
        double[] resultado = new double[nota1.length];

        for (int i = 0, j = 0; i < nota1.length; i++, j++) {
            System.out.println("Digite a primeira nota do aluno " + i+1 + ": ");
            nota1[i] = scan.nextInt();

            System.out.println("Digite a primeira nota do aluno " + j+1 + ": ");
            nota2[j] = scan.nextInt();

            resultado[i] = (nota1[i] + nota2[j]) / 2;
        }

        for (int i = 0; i < resultado.length; i++) {
            if (resultado[i] < 7) {
                System.out.print("Aluno ");
                System.out.print("Média: " + resultado[i] + " | ");
                System.out.print("Situação: Reprovado");

            } else {
                System.out.println("Aluno " + i+1);
                System.out.print("Média: " + resultado[i] + " | ");
                System.out.print("Situação: Aprovado");
            }
        }
    }
}