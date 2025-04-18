package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra qualquer:");
        String letra = scan.next();

        switch (letra) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            case "a":
            case "e":
            case "i":
            case "o":
            case "u": System.out.println(letra + " é uma vogal."); break;
            default: System.out.println(letra + " é uma consoante.");
        }
    }
}