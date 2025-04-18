package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de termos:");
        int h = scan.nextInt();

        double valor = 0;
        for (int i = 1; i <= h; i++) {
            System.out.print(1 + "/" + i + " ");
            valor += 1 / i;
        }
        System.out.println("Valor: " + valor);
    }
}