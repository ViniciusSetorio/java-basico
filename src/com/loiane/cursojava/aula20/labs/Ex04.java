package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] compromissos = new String[30][24];

        boolean agendando = true;
        String escolha;
        int dia;
        int hora;

        do {
            System.out.println("Gostaria de agendar ou alterar um agendamento? (S/N)");
            escolha = scan.next();

            if (escolha.equalsIgnoreCase("S")) {
                System.out.println("Entre com o dia do mês: (1 a 30)");
                dia = scan.nextInt() - 1;

                System.out.println("Entre com o horário do dia: (1 a 24)");
                hora = scan.nextInt() - 1;

                scan.nextLine();

                System.out.println("Digite o compromisso para o dia " + (dia+1) + " às " + (hora+1) + " horas:");
                compromissos[dia][hora] = scan.nextLine();

                System.out.println("Agenda Pessoal");
                for (int i = 0; i < compromissos.length; i++) {
                    for (int j = 0; j < compromissos[i].length; j++) {
                        if (compromissos[i][j] != null) {
                            System.out.println("Dia: " + (i+1) + " | Compromisso das " + (j+1) + " horas: " + compromissos[i][j]);
                        }
                    }
                }
            } else {
                agendando = false;
            }
        } while (agendando);

        scan.close();
    }
}