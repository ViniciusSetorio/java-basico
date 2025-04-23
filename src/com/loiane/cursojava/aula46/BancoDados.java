package com.loiane.cursojava.aula46;

public interface BancoDados extends SqlDLC, SqlDDL, SqlDML {
    void abrirConexao();

    void fecharConexao();
}