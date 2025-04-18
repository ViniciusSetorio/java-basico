package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit: ");
        double temperaturaFarenheit = scan.nextDouble();
        double temperaturaCelsius = (5 * (temperaturaFarenheit - 32) / 9);
        System.out.println("Temperatura em celsius: " + temperaturaCelsius);
    }
}