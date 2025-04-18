package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][][] compromissos = new String[12][31][8];

        boolean agendando = true;
        String escolha;
        int mes = 0;
        int dia = 0;
        int hora = 0;
        boolean mesValido = false;
        boolean diaValido = false;
        boolean horaValido = false;

        do {
            System.out.println("Gostaria de agendar ou alterar um agendamento? (S/N)");
            escolha = scan.next();

            if (escolha.equalsIgnoreCase("S")) {
                while (!mesValido){
                    System.out.println("Entre com o mês: (1 a 12)");
                    mes = scan.nextInt();

                    if (mes >= 1 && mes < 13) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido");
                    }
                }

                while (!diaValido){
                    System.out.println("Entre com o dia do mês: (1 a 31)");
                    dia = scan.nextInt();

                    if (dia >= 1 && dia < 32) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido");
                    }
                }

                while (!horaValido) {
                    System.out.println("Entre com o horário do dia: (0 a 8)");
                    hora = scan.nextInt();

                    if (hora >= 0 && hora <= 8) {
                        horaValido = true;
                    } else {
                        System.out.println("Horário inválido");
                    }
                }

                scan.nextLine();

                System.out.println("Digite o compromisso para o mês " + (mes) + " no dia " + (dia) + " às " + (hora) + " horas:");
                compromissos[--mes][--dia][--hora] = scan.nextLine();

                System.out.println("Agenda Pessoal");
                for (int i = 0; i < compromissos.length; i++) {
                    for (int j = 0; j < compromissos[i].length; j++) {
                        for (int k = 0; k < compromissos[i][j].length; k++) {
                            if (compromissos[i][j][k] != null) {
                                System.out.println("Mês: " + (i+1) + " | Dia: " + (j+1) + " | Compromisso das " + (k+1) + " horas: " + compromissos[i][j][k]);
                            }
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