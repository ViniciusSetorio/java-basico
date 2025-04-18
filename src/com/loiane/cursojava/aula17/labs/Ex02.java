package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com seu nome de usuário:");
        String nomeUsuario = scan.next();

        System.out.println("Entre com sua senha:");
        String senhaUsuario = scan.next();

        while (nomeUsuario.equalsIgnoreCase(senhaUsuario)) {
            System.out.println("Erro: Nome de usuário e senha iguais.");

            System.out.println("Entre com seu nome de usuário:");
            nomeUsuario = scan.next();

            System.out.println("Entre com sua senha:");
            senhaUsuario = scan.next();
        }
        System.out.println("Login realizado!");
    }
}