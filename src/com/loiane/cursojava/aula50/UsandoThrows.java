package com.loiane.cursojava.aula50;

import java.util.Scanner;

public class UsandoThrows {

    public static void main(String[] args) {

        System.out.println("Entre com um número decimal");
        try {
            double numero = lerNumero();
        } catch (Exception e) {
            System.out.println("Entrada inválida.");
            throw new RuntimeException(e);
        }
    }

    public static double lerNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double numero = scan.nextDouble();
        return numero;
    }
}
