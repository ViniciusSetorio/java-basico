package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Montar a tabuada de:");
        int tabuada = scan.nextInt();

        int comeco;
        int termino;
        int multiplicacao;

        do {
            System.out.println("Erro: número de termino maior que número de começo ou maior que 10.");
            System.out.println("Começar por:");
            comeco = scan.nextInt();

            System.out.println("Terminar em:");
            termino = scan.nextInt();
        } while (termino < comeco && termino > 10);

        for (int i = comeco; i <= termino; i++) {
            multiplicacao = tabuada * i;
            System.out.println(tabuada + " x " + i + " = " + multiplicacao);
        }
    }
}