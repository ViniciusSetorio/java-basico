package com.loiane.cursojava.aula33.labs;

import java.util.Scanner;

public class TesteAluno {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno: ");
        aluno.setNome(scan.nextLine());

        System.out.println("Entre com a matrícula do aluno: ");
        aluno.setMatricula(scan.next());

        System.out.println("Entre com o curso do aluno: ");
        aluno.setNomeCurso(scan.next());


        for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
            System.out.println("Entre com o nome da disciplina " + (i+1) + ":");
            aluno.setDisciplinaPos(i, scan.next());
        }

        for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
            System.out.println("Notas da disciplina - " + aluno.getNomeDisciplinas()[i]);
            for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
                System.out.println("Nota " + (j+1) + ":");
                aluno.setNotaPosIJ(i, j, scan.nextDouble());
            }
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
            aluno.verificarAprovacao(aluno.getNomeDisciplinas()[i]);
        }
    }
}