package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

public class TesteAgenda {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda: ");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Entre com as informações do contato " + (i+1) + ": ");
            Contato cont = new Contato();

            System.out.println("Entre com o nome do contato: ");
            String nomeCont = scan.nextLine();
            cont.setNome(nomeCont);

            System.out.println("Entre com o telefone do contato: ");
            String telefoneCont = scan.nextLine();
            cont.setTelefone(telefoneCont);

            System.out.println("Entre com o email do contato: ");
            String emailCont = scan.nextLine();
            cont.setEmail(emailCont);

            contatos[i] = cont;
        }

        agenda.setContatos(contatos);

        if (agenda != null) {
            System.out.println(agenda.obterInfo());
        }
    }
}
