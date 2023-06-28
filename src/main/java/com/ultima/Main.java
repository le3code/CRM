package com.ultima;

import com.ultima.clientes.Cliente;
import com.ultima.clientes.ClienteBuilder;
import com.ultima.repository.Reader;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        ClienteBuilder clienteBuilder = new ClienteBuilder();
        Reader reader = new Reader();


        for (ClienteBuilder r : reader.findAll()) {
            System.out.println(r);
        }

        /*
        System.out.println(clienteBuilder+"aqui");

         */
    }
}