package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as suas 4 notas: ");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double nota4 = scan.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Média: " + media);
    }
}
