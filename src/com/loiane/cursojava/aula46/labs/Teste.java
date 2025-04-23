package com.loiane.cursojava.aula46.labs;

public class Teste {

    public static void main(String[] args) {

        Quadrado q = new Quadrado();
        q.setNome("Quadrado");
        q.setLado(2);
        q.setCor("Vermelho");

        Circulo c = new Circulo();
        c.setNome("Circulo");
        c.setRaio(2);
        c.setCor("Azul");

        Triangulo t = new Triangulo();
        t.setNome("Triangulo");
        t.setAltura(2);
        t.setBase(3);
        t.setCor("Verde");

        Cubo cb = new Cubo();
        cb.setNome("Cubo");
        cb.setLado(3);
        cb.setCor("Amarelo");

        Cilindro ci = new Cilindro();
        ci.setNome("Cilindro");
        ci.setAltura(3);
        ci.setRaio(2);
        ci.setCor("Rosa");

        Piramide p = new Piramide();
        p.setNome("Pirâmide");
        p.setAltura(3);
        p.setApotema(4);
        p.setArestaBase(2);
        p.setNumPoliBase(4);
        p.setBase(q);
        p.setCor("Laranja");

        FiguraGeometrica[] figuras = {q, c, t, cb, ci, p};

        /*for (FiguraGeometrica figura : figuras) {
            System.out.print("-------------------");
            System.out.println(figura.toString());
        }*/

        for (FiguraGeometrica figura : figuras) {
            System.out.print("---------------------");
            System.out.println(figura.getNome());

            if (figura instanceof Figura2D) {
                Figura2D figura2D = (Figura2D) figura;
                System.out.println(figura2D.calcularArea());
            }

            if (figura instanceof Figura3D) {
                Figura3D figura3D = (Figura3D) figura;
                System.out.println(figura3D.calcularArea());
                System.out.println(figura3D.calcularVolume());
            }
        }
    }
}
