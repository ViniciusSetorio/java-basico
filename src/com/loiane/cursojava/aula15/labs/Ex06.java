package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com três valores:");
        double valor1 = scan.nextDouble();
        double valor2 = scan.nextDouble();
        double valor3 = scan.nextDouble();

        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println("O maior valor é " + valor1);
        }else if (valor2 > valor1 && valor2 > valor3) {
            System.out.println("O maior valor é " + valor2);
        } else {
            System.out.println("O maior valor é " + valor3);
        }
    }
}