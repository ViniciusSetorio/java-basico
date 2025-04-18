package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double temperaturaEmCelsius = scan.nextDouble();
        double temperaturaEmFarenheit = (temperaturaEmCelsius * 9/5) + 32;
        System.out.println("Temperatura em Farenheit: " + temperaturaEmFarenheit);
    }
}
