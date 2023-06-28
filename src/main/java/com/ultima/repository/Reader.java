package com.ultima.repository;

import com.ultima.clientes.ClienteBuilder;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    private DatabaseConnection connection;

    public Reader () {

        this.connection = DatabaseConnection.getInstance();

    }

    public List<ClienteBuilder> findAll() throws SQLException {
        List<ClienteBuilder> clients = new ArrayList<>();
        ClienteBuilder client = new ClienteBuilder();

        PreparedStatement preparedStatement = this.connection
                .getConnetion().prepareStatement("SELECT *  FROM cliente");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {

            client.setId(resultSet.getInt("id"));
            client.setNomeCompelto(resultSet.getString("nome_completo"));
            client.setPrimeiroNome(resultSet.getString("primeiro_nome"));
            client.setNomeDoMeio(resultSet.getString("nome_do+meio"));
            client.setSobrenome(resultSet.getString("sobrenome"));
            client.setDataDeNascimento(resultSet.getString("data_nascimento"));
            client.setCpf(resultSet.getString("cpf"));
            client.setIdadeAtual(resultSet.getInt("idade_atual"));
            client.setGenero(resultSet.getString("genero").charAt(0));
            client.setEmail(resultSet.getString("email"));
            client.setEdereco(resultSet.getString("endereco"));
            client.setTelefone(resultSet.getString("telefone"));

            clients.add(client);
        }

        return clients;
    }



}
