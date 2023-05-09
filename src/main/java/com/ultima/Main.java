package com.ultima;

import com.ultima.clientes.Cliente;
import com.ultima.clientes.ClienteBuilder;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setPrimeiroNome("Leonard");
        cliente.setNomeDoMeio("Lopes");
        cliente.setSobrenome("Sousa");
        cliente.setTelefone("16 98189-1251");
        cliente.setDataDeNascimento("28/09/1989");
        cliente.setCpf("152.766.952-11");
        cliente.setGenero('M');
        cliente.setEmail("migleo@gmail.com");
        cliente.setEdereco("rua vial bela 704 casa 3");
        System.out.println(cliente);
        System.out.println("--------------------------------------------------------------------------------");

                            // PRDÃO  DE PROJETO
        //------------------------------------------------------------------------------------------------
        ClienteBuilder clienteBuilder = new ClienteBuilder().comIndetificacao("Leonardo",
                "Ribeiro", "de Sousa","152.776.952-11", "28/09/1989",
               'M', "rua vila bela 704", "16-98542-5584");

        ClienteBuilder contato = new ClienteBuilder().conContatos("leonardo@leo",
                "Rua vila bela ", "16 98189-1251");

        System.out.println(clienteBuilder);

        System.out.println(contato.toStringContatos());
    }
}