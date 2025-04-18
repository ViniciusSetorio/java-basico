package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno: ");
        aluno.nome = scan.nextLine();

        System.out.println("Entre com a matrícula do aluno: ");
        aluno.matricula = scan.next();

        System.out.println("Entre com o curso do aluno: ");
        aluno.nomeCurso = scan.next();


        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            System.out.println("Entre com o nome da disciplina " + (i+1) + ":");
            aluno.nomeDisciplinas[i] = scan.next();
        }

        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina - " + aluno.nomeDisciplinas[i]);
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
                System.out.println("Nota " + (j+1) + ":");
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            aluno.verificarAprovacao(aluno.nomeDisciplinas[i]);
        }
    }
}