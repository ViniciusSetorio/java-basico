package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o turno que você estuda: (M - Matutino, V - Vespertino ou N - Noturno)");
        String turno = scan.next();

        switch (turno) {
            case "M":
            case "m": System.out.println("Bom dia!"); break;
            case "V":
            case "v": System.out.println("Boa tarde!"); break;
            case "N":
            case "n": System.out.println("Boa noite!"); break;
            default: System.out.println("Valor inválido.");
        }
    }
}