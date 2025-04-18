package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Fatorial de: !");
        int numero = scan.nextInt();

        int fatorial = 1;
        for (int i = numero; i > 0; i--) {
            if (i == 1) {
                System.out.print(i + " = ");
            } else {
                fatorial *= i;
                System.out.print(i + " . ");
            }
        }
        System.out.print(fatorial);
    }
}