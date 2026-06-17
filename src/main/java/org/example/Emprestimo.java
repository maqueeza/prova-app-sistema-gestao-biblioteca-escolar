package org.example;

public class Emprestimo {
    private String dataEmprestimo;
    private String dataDevolucao;
    private Livro livro;
    private Aluno aluno;


    public Emprestimo (String dataEmprestimo, String dataDevolucao, Livro livro, Aluno aluno){
        setDataEmprestimo(dataEmprestimo);
        setDataDevolucao(dataDevolucao);
        setLivro(livro);
        setAluno(aluno);
    }


    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        if(dataEmprestimo != null && !dataEmprestimo.isBlank()){
            this.dataEmprestimo = dataEmprestimo;
        }else{
            System.out.println("Data de empréstimo inválida!");
        }

    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        if(dataDevolucao != null && !dataDevolucao.isBlank()){
            this.dataDevolucao = dataDevolucao;
        }else{
            System.out.println("Data de devolução inválida");
        }

    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        if(livro != null){
            this.livro = livro;
        }else{
            System.out.println("Nenhum livro encontrado!");
        }

    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        if(aluno != null){
            this.aluno = aluno;
        }else{
            System.out.println("Nenhum aluno encontrado!");
        }

    }

    public void exibirDados(){
        System.out.println("Data do empréstimo: " + getDataEmprestimo());
        System.out.println("Data de devolução: " + getDataDevolucao());
        System.out.println(">>> LIVRO <<<");
        livro.exibirDados();
        System.out.println(">>> SOLICITANTE <<<");
        aluno.exibirDados();

    }
}

//Atributos:
//
//dataEmprestimo;
//dataDevolucao;
//livro;
//aluno.



//Validações:
//
//não permitir criar empréstimo se não houver aluno cadastrado;
//não permitir criar empréstimo se não houver livro cadastrado;
//mostrar a lista de alunos cadastrados para o usuário escolher um aluno;
//mostrar a lista de livros cadastrados para o usuário escolher um livro;
//não permitir data de empréstimo vazia;
//não permitir data de devolução vazia;
//cada empréstimo deve estar vinculado a apenas um livro e a apenas um aluno.