package com.ultima.clientes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClienteBuilder {

    private String nomeCompelto;
    private String primeiroNome;
    private String nomeDoMeio;
    private String sobrenome;
    private String dataDeNascimento;
    private String cpf;
    private Integer idadeAtual;
    private String email;
    private Character genero;
    private String endereco;
    private String telefone;

    public ClienteBuilder() {}



    public ClienteBuilder comIndetificacao( String primeiroNome, String nomeDoMeio, String sobrenome,
                                           String cpf,
                                           String dataDeNascimento,  Character genero, String endereco, String telefone) {

        this.primeiroNome = primeiroNome;
        this.nomeDoMeio = nomeDoMeio;
        this.sobrenome = sobrenome;
        this.nomeCompelto = primeiroNome +" "+ nomeDoMeio +" "+ sobrenome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.idadeAtual = definirIdadeAtual();
        this.genero = genero;


        return this;
    }

    public ClienteBuilder conContatos(String email, String endereco, String telefone) {
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        return this;
    }

    //------------------ Get e Set ---------------------------

    public String getPirmeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getNomeDoMeio() {
        return nomeDoMeio;
    }

    public void setNomeDoMeio(String nomeDoMeio ) {
        this.nomeDoMeio = nomeDoMeio;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome ) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdadeAtual() {
        return idadeAtual;
    }



    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEdereco(String endereco ) {
        this.endereco = endereco;
    }

    public String  getTelefone() {
        return  telefone;

    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;

    }

    public String getDataDenascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDenascimento) {
        this.dataDeNascimento = dataDenascimento;
    }

    //-------------- METODOS--------------------------------------------------

    private int definirIdadeAtual() {

        return recuperarAnoAtual() - recuperarAnoDeNascimento();

    }
    private  String nomeCompleto() {
        return  this.nomeCompelto = this.primeiroNome+" "+this.nomeDoMeio+" "+this.sobrenome;
    }

    private Integer recuperarAnoDeNascimento() {
        Calendar calendario = Calendar.getInstance();

        Date dataDeNascimetoCliente = new Date();
        try {

            dataDeNascimetoCliente = definirFormatoData().parse(dataDeNascimento);

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();


        }

        calendario.setTime(dataDeNascimetoCliente);
        return calendario.getWeekYear();
    }


    private Integer recuperarAnoAtual() { // data do  dia de hoje
        Calendar calendario = Calendar.getInstance();
        Date diaAtual = new Date();
        calendario.setTime(diaAtual);
        return calendario.getWeekYear();

    }
    private SimpleDateFormat definirFormatoData() { // formato  da data

        if ("dd/MM/YYYY" == "") {
            return new SimpleDateFormat("dd/MM/YYYY");
        }
        return new SimpleDateFormat("dd/MM/YYYY");

    }

    private String tratamentoGenero() {

        if ( getGenero() == 'M') {
            return  "Sr.";

        } else if (getGenero() == 'F') {
            return "Sra.";

        }else {
            return  "";
        }
    }


    public String toString() {
        return "Nome Completo: "+tratamentoGenero()+" "+nomeCompleto()+ "\n"
                +"Idade: "+definirIdadeAtual()+"\n"
                +"Cpf: "+cpf+"\n";
    }

    public String toStringContatos() {
        return "Email: "+ getEmail()+"\n"
                +"End.: "+getEndereco()+"\n"
                +"Tel.:"+getTelefone();
    }

}
