package com.ultima.clientes;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ClienteBuilderTest extends TestCase {
    private ClienteBuilder clienteBuilder = new ClienteBuilder();

    @Test
    public void testSetPrimeiroNome() {
        clienteBuilder.setPrimeiroNome("leonard");
        assertEquals(clienteBuilder.getPirmeiroNome(), "leonard");
        //clienteBuilder.setPrimeiroNome("*&*99");
        //assertEquals(clienteBuilder.getPirmeiroNome(), "*&*99");
        //clienteBuilder.setPrimeiroNome("123456789");
        //assertEquals(clienteBuilder.getPirmeiroNome(), "123546789");


    }

    @Test
    public void testNomeDoMeio() {
        clienteBuilder.setNomeDoMeio("Sousa");
        assertEquals(clienteBuilder.getNomeDoMeio(), "Sousa");
    }

    @Test
    public void testSeteSobrenome() {
        //clienteBuilder.setSobrenome("Sousa");
        //assertEquals(clienteBuilder.getSobrenome(), "Sousa");
        clienteBuilder.setSobrenome("Sousa");
        assertEquals(clienteBuilder.getSobrenome(), "Sousa");
    }

    @Test
    public void testSetemail() {
        clienteBuilder.setEmail("leo@leo");
        assertEquals(clienteBuilder.getEmail(), "leo@leo");
        //clienteBuilder.setEmail("leo_leo");
        //assertEquals(clienteBuilder.getEmail(), "leo@leo");
        //clienteBuilder.setEmail("leo@leo");
        //assertEquals(clienteBuilder.getEmail(), "");


    }
    @Test
    public void testSetTefone() {
        //clienteBuilder.setTelefone("16 981891251");
        //assertEquals(clienteBuilder.getTelefone(), "16 981891251");
        clienteBuilder.setTelefone("(16) 98189-1251");
        assertEquals(clienteBuilder.getTelefone(), "(16) 98189-1251");
    }

    @Test
    public void testSetDataDeNascimento() {
        clienteBuilder.setDataDeNascimento("28/09/1989");
        assertEquals(clienteBuilder.getDataDenascimento(), "28/09/1989");
    }
    @Test
    public void testGetCpf() {
        clienteBuilder.setCpf("12345678900");
        assertFalse(clienteBuilder.getCpf(), Boolean.parseBoolean("123.456.789-00"));
    }

    @Test
    public void testSetGenero() {
        clienteBuilder.setGenero('M');
        assertEquals(clienteBuilder.getGenero().charValue(), 'M');
        //clienteBuilder.setGenero('0');
        //assertEquals(clienteBuilder.getGenero().charValue(), 'M');


    }


}