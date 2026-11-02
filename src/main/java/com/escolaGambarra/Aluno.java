package com.escolaGambarra;

public class Aluno {
    private String nome;
    private String enderecoResidencial;
    private String telefoneContato;
    private String email;
    private String matricula;

    // Construtor Vazio
    public Aluno() {}

    // Construtor Completo
    public Aluno(String nome, String enderecoResidencial, String telefoneContato, String email, String matricula) {
        this.nome = nome;
        this.enderecoResidencial = enderecoResidencial;
        this.telefoneContato = telefoneContato;
        this.email = email;
        this.matricula = matricula;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEnderecoResidencial() { return enderecoResidencial; }
    public void setEnderecoResidencial(String enderecoResidencial) { this.enderecoResidencial = enderecoResidencial; }

    public String getTelefoneContato() { return telefoneContato; }
    public void setTelefoneContato(String telefoneContato) { this.telefoneContato = telefoneContato; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
}