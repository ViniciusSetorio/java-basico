package com.loiane.cursojava.aula51.labs;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3) {
            opcao = obterOpcaoMenu(scan);

            switch (opcao) {
                case 1:
                    consultarContato(scan, agenda);
                    break;
                case 2:
                    adicionarContato(scan, agenda);
                    break;
                case 3:
                    break;
                default:
            }
        }
    }

    public static void adicionarContato(Scanner scan, Agenda agenda) {
        System.out.println("Entre com o nome do contato: ");
        String nomeContato = scan.nextLine();

        System.out.println("Entre com o telefone do contato: ");
        String telefoneContato = scan.nextLine();

        System.out.println("Entre com o email do contato: ");
        String emailContato = scan.nextLine();

        Contato contato = new Contato(nomeContato, telefoneContato, emailContato);

        try {
            agenda.adicionarContato(contato);
            System.out.println("Contato adicionado com sucesso!");

        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void consultarContato(Scanner scan, Agenda agenda) {
        String nomeContato = lerInformacaoString(scan, "Digite o nome do contato: ");

        try {
            if (agenda.consultarContato(nomeContato) >= 0) {
                System.out.println("Contato encontrado na agenda.");
            }
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String lerInformacaoString(Scanner scan, String msg) {
        System.out.println(msg);
        return scan.nextLine();
    }

    public static int obterOpcaoMenu(Scanner scan) {

        int opcao = 3;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("1 - Consultar contato na agenda\n2 - Adicionar contato na agenda\n3 - sair");

            try {
                String linha = scan.nextLine();
                opcao = Integer.parseInt(linha);

                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada inválida. Por favor, digite novamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, digite novamente.");
            }
        }
        return opcao;
    }
}