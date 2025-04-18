package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com seu nome:");
        String nomeUsuario = scan.next();

        System.out.println("Entre com sua idade:");
        int idadeUsuario = scan.nextInt();

        System.out.println("Entre com seu salário:");
        double salarioUsuario = scan.nextDouble();

        System.out.println("Entre com seu sexo(F - feminino, M - masculino)");
        String sexoUsuario = scan.next();

        System.out.println("Entre com seu estado civil(S - solteiro, C - casado, V - viúvo, D - divorciado)");
        String estadoCivilUsuario = scan.next();


        while (true) {
            if (nomeUsuario.length() > 3) {
                System.out.println("Nome válido!");
            } else {
                System.out.println("Nome inválido.");
                System.out.println("Entre com seu nome:");
                nomeUsuario = scan.next();
            }

            if (idadeUsuario >= 0 && idadeUsuario <= 150) {
                System.out.println("Idade válida!");
            } else {
                System.out.println("Idade inválida.");
                System.out.println("Entre com sua idade:");
                idadeUsuario = scan.nextInt();
            }

            if (salarioUsuario > 0) {
                System.out.println("Salário válido!");
            } else {
                System.out.println("Salário inválido.");
                System.out.println("Entre com seu salário:");
                salarioUsuario = scan.nextDouble();
            }

            if (sexoUsuario.equalsIgnoreCase("F") || sexoUsuario.equalsIgnoreCase("M")) {
                System.out.println("Sexo válido!");
            } else {
                System.out.println("Sexo inválido.");
                System.out.println("Entre com seu sexo(F - feminino, M - masculino)");
                sexoUsuario = scan.next();
            }

            if (estadoCivilUsuario.equalsIgnoreCase("S") || estadoCivilUsuario.equalsIgnoreCase("C") || estadoCivilUsuario.equalsIgnoreCase("V") || estadoCivilUsuario.equalsIgnoreCase("D")) {
                System.out.println("Estado civil válido!");
                break;
            } else {
                System.out.println("Estado inválido.");
                System.out.println("Entre com seu estado civil(S - solteiro, C - casado, V - viúvo, D - divorciado)");
                estadoCivilUsuario = scan.next();
            }
        }
        System.out.println("Validação completa");
    }
}