package com.ultima.repository;

import com.ultima.clientes.ClienteBuilder;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Inserte {

    ClienteBuilder cliente = new ClienteBuilder();
    private DatabaseConnection connection;

    public Inserte() {
        this.connection = DatabaseConnection.getInstance();
    }

    public Boolean insert(ClienteBuilder cliente1) throws SQLException {
        boolean insertd = false;

        String insertSQL = "INSERT INTO cliente"+
                "( primeiro_nome, nome_do_meio, sobrenome, data_nascimento, "+
                "cpf, idade_atual, email, genero, endereco, telefone)"+
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = this.connection
                .getConnetion().prepareStatement(insertSQL);

        preparedStatement.setString(1, cliente.getPirmeiroNome());
        preparedStatement.setString(2, cliente.getNomeDoMeio());
        preparedStatement.setString(3, cliente.getSobrenome());
        preparedStatement.setString(4, cliente.getDataDenascimento());
        preparedStatement.setString(5, cliente.getCpf());
        preparedStatement.setInt(6, cliente.getIdadeAtual());
        preparedStatement.setString(7, cliente.getEmail());
        preparedStatement.setString(8, String.valueOf(cliente.getGenero()));
        preparedStatement.setString(9, cliente.getEndereco());
        preparedStatement.setString(10, cliente.getTelefone());

        insertd = preparedStatement.execute();
        return insertd;
    }




}
