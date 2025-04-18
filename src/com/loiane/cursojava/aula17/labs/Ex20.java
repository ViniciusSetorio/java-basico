package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;
        int soma = 0;

        System.out.println("Quantas pessoas dirão suas idade?");
        int nPessoas = scan.nextInt();
        for (int i = 0; i < nPessoas; i++) {
            System.out.println("Entre com a idade:");
            idade = scan.nextInt();

            soma += idade;
        }
        int media = soma / nPessoas;

        if (media > 0 && media <= 25) {
            System.out.println("Turma jovem.");
        } else if (media > 25 && media <= 60) {
            System.out.println("Turma adulta.");
        } else {
            System.out.println("Turma idosa.");
        }
    }
} 