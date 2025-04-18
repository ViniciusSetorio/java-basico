package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor da sua hora de trabalho:");
        double valorHora = scan.nextDouble();

        System.out.println("Horas trabalhadas por mês:");
        int horasMes = scan.nextInt();

        double salarioBruto = valorHora * horasMes;
        int percentualIR = 0;
        int percentualINSS = 0;
        int percentualFGTS = 0;

        double descontoIR = 0;
        double descontoINSS = 0;
        double descontoFGTS = 0;

        double totalDesconto = 0;

        double salarioLiquido = 0;

        if (salarioBruto <= 900.00) {
            percentualIR = 5;
            percentualINSS = 10;
            percentualFGTS = 11;

            descontoIR = (salarioBruto * 100) / percentualIR;
            descontoINSS = (salarioBruto * 100) / percentualINSS;
            descontoFGTS = (salarioBruto * 100) / percentualFGTS;

            totalDesconto = descontoINSS + descontoFGTS;

            salarioLiquido = salarioBruto - totalDesconto;

        } else if (salarioBruto <= 1_500.00) {
            percentualIR = 5;
            percentualINSS = 10;
            percentualFGTS = 11;

            descontoIR = (salarioBruto * 100) / percentualIR;
            descontoINSS = (salarioBruto * 100) / percentualINSS;
            descontoFGTS = (salarioBruto * 100) / percentualFGTS;

            totalDesconto = descontoINSS + descontoFGTS;

            salarioLiquido = salarioBruto - totalDesconto;

        } else if (salarioBruto <= 2_500.00) {
            percentualIR = 10;
            percentualINSS = 10;
            percentualFGTS = 11;

            descontoIR = (salarioBruto * 100) / percentualIR;
            descontoINSS = (salarioBruto * 100) / percentualINSS;
            descontoFGTS = (salarioBruto * 100) / percentualFGTS;

            totalDesconto = descontoINSS + descontoFGTS;

            salarioLiquido = salarioBruto - totalDesconto;

        } else if (salarioBruto > 2_500.00){
            percentualIR = 20;
            percentualINSS = 10;
            percentualFGTS = 11;

            descontoIR = (salarioBruto * 100) / percentualIR;
            descontoINSS = (salarioBruto * 100) / percentualINSS;
            descontoFGTS = (salarioBruto * 100) / percentualFGTS;

            totalDesconto = descontoINSS + descontoFGTS;

            salarioLiquido = salarioBruto - totalDesconto;
        }

        System.out.println("Salário Bruto: (" + valorHora + " * " + horasMes + ")  :" + salarioBruto);
        System.out.println("(-) IR (" + percentualIR + "%)  :" + descontoIR);
        System.out.println("(-) INSS (" + percentualINSS + "%)  :" + descontoINSS);
        System.out.println("FGTS (" + percentualFGTS + "%)  :" + descontoFGTS);
        System.out.println("Total de descontos: " + totalDesconto);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}