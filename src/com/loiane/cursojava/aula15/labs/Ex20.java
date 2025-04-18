package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vítima?");
        String questao1 = scan.next();

        System.out.println("Esteve no local do crime?");
        String questao2 = scan.next();

        System.out.println("Mora perto da vítima?");
        String questao3 = scan.next();

        System.out.println("Devia para a vítima?");
        String questao4 = scan.next();

        System.out.println("Já trabalhou com a vítima?");
        String questao5 = scan.next();

        if (questao1.equalsIgnoreCase("sim") && questao2.equalsIgnoreCase("sim")) {
            System.out.println("Suspeita.");
        } else if (questao1.equalsIgnoreCase("sim") && questao2.equalsIgnoreCase("sim") && questao3.equalsIgnoreCase("sim") && questao4.equalsIgnoreCase("sim")) {
            System.out.println("Cúmplice.");
        } else if (questao1.equalsIgnoreCase("sim") && questao2.equalsIgnoreCase("sim") && questao3.equalsIgnoreCase("sim") && questao4.equalsIgnoreCase("sim") && questao5.equalsIgnoreCase("sim")) {
            System.out.println("Assassino.");
        } else {
            System.out.println("Inocente.");
        }
    }
}