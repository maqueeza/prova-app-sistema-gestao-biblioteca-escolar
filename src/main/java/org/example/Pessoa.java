package org.example;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;


    public Pessoa (String nome, String cpf, String telefone){
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isBlank()){
            this.nome = nome;
        }else{
            System.out.println("Nome inválido!");
        }

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf != null && !cpf.isBlank()){
            this.cpf = cpf;
        }else{
            System.out.println("Cpf inválido!");
        }

    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if(telefone != null && !telefone.isBlank()){
            this.telefone = telefone;
        }

    }

    public abstract void exibirDados();

    public abstract String getTipoPessoa();
}


//nome;
//cpf;
//telefone.
//
//Métodos obrigatórios:
//
//