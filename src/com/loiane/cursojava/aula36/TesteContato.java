package com.loiane.cursojava.aula36;

public class TesteContato {

    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Tyrion");
        //contato.setEndereco("Kings Landing");

        Endereco endereco = new Endereco();
        endereco.setNomeRua("Rua Game of Thrones");
        endereco.setNumero("N/A");
        endereco.setComplemento("-");
        endereco.setCidade("Kings Landing");
        endereco.setEstado("Westeros");
        endereco.setCep("9999999");

        contato.setEndereco(endereco);

        Telefone telefone = new Telefone();
        telefone.setNumero("11 99999-9999");
        telefone.setDdd("11");
        telefone.setTipo("celular");

        Telefone telefone2 = new Telefone();
        telefone2.setNumero("11 88888-8888");
        telefone2.setDdd("11");
        telefone2.setTipo("casa");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        //contato.setTelefones(telefone);
        contato.setTelefones(telefones);

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        } else {
            System.out.println("Erro: endereço inválido");
        }

        /*if (contato != null && contato.getTelefones() != null) {
            System.out.println(contato.getTelefones().getDdd() + " " + contato.getTelefones().getNumero());
        } else {
            System.out.println("Erro: telefone inválido");
        }*/

        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }
    }
}
