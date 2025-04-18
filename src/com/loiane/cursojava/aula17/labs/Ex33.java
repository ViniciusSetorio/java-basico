package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de termos:");
        int n = scan.nextInt();
        double valor = 0;

        for (int i = 1, j = 1; i <= n; i++, j+=2) {
            System.out.print(i + "/" + j + " ");
            valor += (double) i / j;
        }
        System.out.println("Valor: " + valor);
    }
}