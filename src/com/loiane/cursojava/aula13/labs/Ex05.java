package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor em metros: ");
        double metros = scan.nextDouble();
        double centimetros = metros * 100;
        System.out.println("O valor em centímetros é: " + centimetros);
    }
}
