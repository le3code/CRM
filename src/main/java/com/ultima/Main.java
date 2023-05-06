package com.ultima;

import com.ultima.clientes.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setPrimeiroNome("Miguel Leonard");
        cliente.setNomeDoMeio("Lopes");
        cliente.setSobrenome("Sousa");
        cliente.setTelefone("16 98189-1251");
        cliente.setDataDeNascimento("23/05/2020");
        cliente.setCpf("152.766.952-11");
        cliente.setGenero('M');
        cliente.setEmail("migleo@gmail.com");
        cliente.setEdereco("rua vial bela 704 casa 3");
        System.out.println(cliente);
    }
}