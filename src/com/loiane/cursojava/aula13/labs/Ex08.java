package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double salarioPorHora = scan.nextDouble();

        System.out.println("Quantas horas você trabalha por mês? ");
        double horasPorMes = scan.nextDouble();
        double salarioMensal = salarioPorHora * horasPorMes;
        System.out.println("Salário por mês: " + salarioMensal);
    }
}
