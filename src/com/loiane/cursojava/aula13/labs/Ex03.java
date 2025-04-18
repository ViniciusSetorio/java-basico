package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double soma = num1 + num2;
        System.out.println("Soma dos dois números: " + soma);
    }
}
