package com.loiane.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Salário inicial:");
        double salario = scan.nextDouble();
        double percentualAumento = 1.5;

        salario += (salario / 100) * percentualAumento;

        DecimalFormat format = new DecimalFormat("###,###.##");

        int ano = 1997;
        for (int i = ano; i <= 2007; i++) {
            salario += (salario / 100) * percentualAumento;
            percentualAumento *= 2;
        }
        System.out.println("Salário atual: " + format.format(salario));
    }
}