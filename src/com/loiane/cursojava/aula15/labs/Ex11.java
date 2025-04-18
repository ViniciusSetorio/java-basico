package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o salário do colaborador:");
        double salario = scan.nextDouble();

        int percentual = 0;
        double salarioReajustado = 0;
        double valorAumento = 0;

        if (salario <= 280.00) {
            percentual = 20;
            salarioReajustado = (salario * 100) / percentual;
            valorAumento = salarioReajustado - salario;

        } else if (salario > 280.00 && salario <= 700.00) {
            percentual = 15;
            salarioReajustado = (salario * 100) / percentual;
            valorAumento = salarioReajustado - salario;

        } else if (salario > 700.00 && salario <= 1_500.00) {
            percentual = 10;
            salarioReajustado = (salario * 100) / percentual;
            valorAumento = salarioReajustado - salario;

        } else {
            percentual = 10;
            salarioReajustado = (salario * 100) / percentual;
            valorAumento = salarioReajustado - salario;
        }

        System.out.println("Salário: " + salario);
        System.out.println("Percentual de aumento: " + percentual + "%");
        System.out.println("Valor do aumento: " + valorAumento);
        System.out.println("Salário reajustado: " + salarioReajustado);
    }
}