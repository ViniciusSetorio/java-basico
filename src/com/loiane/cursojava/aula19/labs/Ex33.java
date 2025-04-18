package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do índice " + i + ":");
            vetorA[i] = scan.nextInt();
        }

        boolean primo = true;
        String msg;
        for (int i = 0; i < vetorA.length; i++) {
            primo = true;

            for (int j = 2; j < vetorA[i]; j++) {
                if (vetorA[i] % 2 == 0) {
                    primo = false;
                    break;
                }
            }

            msg = "";
            if (primo) {
                msg = " é primo.";
            } else {
                msg = " não é primo.";
            }
            System.out.println(vetorA[i] + msg);
        }
    }
}