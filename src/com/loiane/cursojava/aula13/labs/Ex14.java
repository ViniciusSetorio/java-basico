package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo (MB):");
        double tamanhoArquivo = scan.nextDouble();

        System.out.println("Velocidade da internet (Mbps):");
        double velocidadeInternet = scan.nextDouble();

        double tempo = tamanhoArquivo / velocidadeInternet;
        System.out.println("Tempo de download: " + tempo);
    }
}
