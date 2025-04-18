package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre como o número de turmas:");
        int numTurmas = scan.nextInt();

        int numAlunos;
        int soma = 0;
        boolean valido = true;

        for (int i = 1; i <= numTurmas; i++) {
            do {
                System.out.println("Entre com o número de alunos da turma " + i);
                numAlunos = scan.nextInt();

                if (numAlunos >= 40) {
                    valido = false;
                } else {
                    System.out.println("Número de alunos inválido.");
                }
            } while (valido);
            soma += numAlunos;
        }
        int media = soma / numTurmas;
        System.out.println("Média: " + media);
    }
} 