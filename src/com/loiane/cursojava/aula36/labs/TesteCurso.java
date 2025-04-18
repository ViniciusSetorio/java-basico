package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

public class TesteCurso {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Curso curso = new Curso("Curso de ADS", "18:00");
        Professor professor = new Professor("Professor", "departamento", "professor@email.com");

        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < alunos.length; i++) {
            Aluno aluno = new Aluno();

            System.out.println("Entre com o nome do aluno " + (i+1) + ": ");
            aluno.setNome(scan.next());

            System.out.println("Entre com a matricula do aluno " + (i+1) + ": ");
            aluno.setMatricula(scan.next());

            double[] notas = new double[4];
            for (int j = 0; j < 4; j++) {
                System.out.println("Entre com a nota " + (j+1) + " do aluno " + (i+1) + ": ");
                notas[j] = scan.nextDouble();
            }

            aluno.setNotas(notas);
            alunos[i] = aluno;
        }

        curso.setAlunos(alunos);

        System.out.println(curso.getNome());

        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("Notas: " + aluno.calcularMedia());
        }
        System.out.println("Media da turma: " + curso.calcularMediaTurma());
    }
}
