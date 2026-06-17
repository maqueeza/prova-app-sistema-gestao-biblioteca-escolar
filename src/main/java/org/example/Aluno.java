package org.example;

public class Aluno extends Pessoa{
        private int matricula;
        private String turma;

    public Aluno(String nome, String cpf, String telefone, int matricula, String turma) {
        super(nome, cpf, telefone);
        setMatricula(matricula);
        setTurma(turma);
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if(matricula > 0){
            this.matricula = matricula;
        }else{
            System.out.println("Turma inválida!");
        }

    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        if(turma != null && !turma.isBlank()){
            this.turma = turma;
        }else{
            System.out.println("Turma inválida!");
        }

    }

    @Override
    public void exibirDados() {
        System.out.println("USUÁRIO: " + getTipoPessoa());
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Turma: " + getTurma());

    }

    @Override
    public String getTipoPessoa() {
        return "ALUNO";
    }
}



//Herda de Pessoa.
//
//Atributos:
//
//matricula;
//turma.


//Validações:
//
//não permitir cadastrar nome vazio;
//não permitir CPF vazio;
//não permitir telefone vazio;
//não permitir matrícula menor ou igual a zero;
//não permitir turma vazia;