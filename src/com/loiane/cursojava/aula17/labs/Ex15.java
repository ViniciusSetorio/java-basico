package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Número da sequência: ");
        int n = scan.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.println(primeiro + " " + segundo);

        for (int i = 3; i <= n; i++) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.print(proximo + " ");
        }
    }
}