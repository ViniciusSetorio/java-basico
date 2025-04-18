package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDeDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é " + idade);

        System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é " + altura);
        */

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem pet de estimação:");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qntFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean pet = scan.nextBoolean();
        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Quantidade de filhos: " + qntFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem um pet? " + pet);
    }
}