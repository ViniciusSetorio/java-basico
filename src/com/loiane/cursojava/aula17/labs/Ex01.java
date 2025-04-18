package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma nota entre zero e dez:");
        double nota = scan.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Digite uma nota entre zero e dez:");
            nota = scan.nextDouble();
        }
        System.out.println("Nota: " + nota);
    }
}