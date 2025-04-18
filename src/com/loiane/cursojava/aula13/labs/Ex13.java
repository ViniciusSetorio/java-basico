package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double salarioPorHora = scan.nextDouble();

        System.out.println("Quantas horas você trabalha por mês? ");
        double horasPorMes = scan.nextDouble();

        double salarioBruto = salarioPorHora * horasPorMes;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double descontoTotal = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - descontoTotal;

        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("IR: " + ir);
        System.out.println("Salário líquido: " + salarioLiquido);
    }
}