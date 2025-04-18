package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com dois números:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Qual operação você deseja realizar?(+, -, x e /)");
        String sinalOper = scan.next();

        double operacao = 0;
        switch (sinalOper) {
            case "+": operacao = num1 + num2; break;
            case "-": operacao = num1 - num2; break;
            case "*": operacao = num1 * num2; break;
            case "/": operacao = (double) num1 / num2; break;
            default: System.out.println("Operação inválida.");
        }
        System.out.println("Resultado: " + operacao);

        if (operacao % 2 == 0 && operacao >= 0) {
            System.out.println("O número é par e positivo.");
        } else if (operacao % 2 == 0 && operacao < 0) {
            System.out.println("O número é par e negativo.");
        } else if (operacao % 2 != 0 && operacao >= 0) {
            System.out.println("O número é ímpar e positivo.");
        } else if (operacao % 2 != 0 && operacao < 0) {
            System.out.println("O número é ímpar e negativo.");
        }
    }
}