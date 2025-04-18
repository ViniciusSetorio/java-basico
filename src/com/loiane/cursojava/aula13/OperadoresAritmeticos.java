package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String string1 = "Esta é ";
        String string2 = "uma string concatenada.";
        String string3 = string1 + string2;
        System.out.println(string3);

        resultado++;
        System.out.println(resultado);
        // mesma coisa que
        System.out.println(++resultado);

        resultado--;
        System.out.println(resultado);
        // mesma coisa que
        System.out.println(--resultado);


    }
}
