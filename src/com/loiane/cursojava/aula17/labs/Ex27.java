package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de temperaturas:");
        int qtnTemperaturas = scan.nextInt();

        double temperaturaAtual;
        double maiorTemperatura = 0;
        double menorTemperatura = 0;
        double media;

        for (int i = 1; i <= qtnTemperaturas; i++) {
            System.out.println("Temperatura " + i + ":");
            temperaturaAtual = scan.nextInt();

            if (temperaturaAtual >= maiorTemperatura) {
                maiorTemperatura = temperaturaAtual;
            } else if (temperaturaAtual <= menorTemperatura){
                menorTemperatura = temperaturaAtual;
            }

            media = maiorTemperatura - menorTemperatura;
            System.out.println("Maior temperatura: " + maiorTemperatura);
            System.out.println("Menor temperatura: " + menorTemperatura);
            System.out.println("Média: " + media);
        }
    }
}