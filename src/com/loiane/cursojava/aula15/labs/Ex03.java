package com.loiane.cursojava.aula15.labs;

import java.util.Objects;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite \"F\" ou \"M\":");
        String letra = scan.next();

        if (letra.equalsIgnoreCase("F")) {
            System.out.println("Sexo Feminino.");
        } else if (letra.equalsIgnoreCase("M")) {
            System.out.println("Sexo Masculino.");
        } else {
            System.out.println("Sexo inválido.");
        }
    }
}