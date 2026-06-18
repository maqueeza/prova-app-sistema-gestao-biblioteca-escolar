package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static ArrayList <Pessoa> pessoas = new ArrayList<>();
    static ArrayList <Livro> livros = new ArrayList<>();
    static ArrayList <Emprestimo> emprestimos = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);



    static void main(String[] args) {

        Pessoa pessoa = new Aluno("Dieni","222.333.444-02","3275-8859", 3257, "Unicornio");
        pessoas.add(pessoa);


        Livro livro = new Livro(251, "Um 10 em programação", "Maqueeza");
        livros.add(livro);



        int opcao;


        do {
            System.out.println("\n===== SISTEMA DE BIBLIOTECA ESCOLAR =====");
            System.out.println("1 - Menu Alunos");
            System.out.println("2 - Menu Livros");
            System.out.println("3 - Menu Empréstimos");
            System.out.println("4 - Relatórios");
            System.out.println("0 - Sair");
            System.out.print("Selecione uma opção: ");


            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {
                case 1:
                    menuAlunos();
                    break;
                case 2:
                    menuLivros();
                    break;
                case 3:
                    menuEmprestimos();
                    break;
                case 4:
                    menuRelatorios();
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }


        } while (opcao != 0);
    }


    public static void menuAlunos() {
        int opcao;


        do {
            System.out.println("\n===== MENU ALUNOS =====");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("0 - Voltar");
            System.out.print("Opção: ");


            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }


        } while (opcao != 0);
    }


    public static void menuLivros() {
        int opcao;


        do {
            System.out.println("\n===== MENU LIVROS =====");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("0 - Voltar");
            System.out.print("Opção: ");


            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }


        } while (opcao != 0);
    }


    public static void menuEmprestimos() {
        int opcao;


        do {
            System.out.println("\n===== MENU EMPRÉSTIMOS =====");
            System.out.println("1 - Criar empréstimo");
            System.out.println("2 - Listar empréstimos");
            System.out.println("0 - Voltar");
            System.out.print("Opção: ");


            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {
                case 1:
                    criarEmprestimo();
                    break;
                case 2:
                    listarEmprestimos();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }


        } while (opcao != 0);
    }


    public static void menuRelatorios() {
        int opcao;


        do {
            System.out.println("\n===== RELATÓRIOS =====");
            System.out.println("1 - Exibir todos os alunos");
            System.out.println("2 - Exibir todos os livros");
            System.out.println("3 - Exibir todos os empréstimos");
            System.out.println("0 - Voltar");
            System.out.print("Opção: ");


            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {
                case 1:
                    listarAlunos();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    listarEmprestimos();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }


        } while (opcao != 0);
    }


    public static void cadastrarAluno() {

        System.out.println(">>> CADASTRAR ALUNO <<<");
        System.out.println("\nNome: ");
        String nome = sc.nextLine();

        System.out.println("CPF: ");
        String cpf = sc.nextLine();

        System.out.println("Telefone: ");
        String telefone = sc.nextLine();

        System.out.println("Matrícula: ");
        int matricula = sc.nextInt();
        sc.nextLine();

        System.out.println("Turma: ");
        String turma = sc.nextLine();


        Pessoa pessoa = new Aluno (nome, cpf, telefone, matricula, turma);
        pessoas.add(pessoa);

        System.out.println(">>> ALUNO CADASTRADO COM SUCESSO! <<<");



    }


    public static void listarAlunos() {

        boolean encontrado = false;
        int i = 0;

            for(Pessoa pessoa : pessoas){
                if(pessoa instanceof Aluno){
                    System.out.println("\n");
                    System.out.println( (i+1) + "º Aluno: ");
                    pessoa.exibirDados();
                    System.out.println("\n");
                    i++;

                    encontrado = true;
                }
            }

            if(!encontrado){
                System.out.println("Nenhum aluno encontrado.");
            }


    }


    public static void cadastrarLivro() {

        System.out.println(">>> CADASTRAR LIVRO <<<");

        System.out.println("\nCódigo: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.println("Título: ");
        String titulo = sc.nextLine();

        System.out.println("Autor: ");
        String autor = sc.nextLine();

        Livro livro = new Livro(codigo, titulo, autor);
        livros.add(livro);



    }


    public static void listarLivros() {

        if(livros.isEmpty()){
            System.out.println("Nenhum livro encontrado!");
        }else{
            for(int i = 0; i < livros.size(); i++){
                System.out.println("\n");
                System.out.println( (i+1) + "º Livro: ");
                livros.get(i).exibirDados();
                System.out.println("\n");
            }
        }

    }


    public static void criarEmprestimo() {

        System.out.println(">>> CRIAR EMPRÉSTIMO <<<");

        System.out.println("\n Data do empréstimo: ");
        String dataEmprestimo = sc.nextLine();

        System.out.println("Data da devolução: ");
        String dataDevolucao = sc.nextLine();

        listarLivros();
        System.out.println("Escolha o número do livro: ");
        int indexLivro = sc.nextInt() -1;
        sc.nextLine();

        listarAlunos();
        System.out.println("Escolha o número do aluno: ");
        int indexAluno = sc.nextInt() -1;
        sc.nextLine();

        Livro livro = livros.get(indexLivro);
        Aluno aluno = (Aluno) pessoas.get(indexAluno);

        Emprestimo emprestimo = new Emprestimo(dataEmprestimo, dataDevolucao, livro, aluno);
        emprestimos.add(emprestimo);


    }


    public static void listarEmprestimos() {

        if(emprestimos.isEmpty()){
            System.out.println("Nenhum empréstimo encontrado!");
        }else{
            for(int i = 0; i < emprestimos.size(); i++){
                System.out.println("\n");
                System.out.println( (i+1) + "º Empréstimo: ");
                emprestimos.get(i).exibirDados();
                System.out.println("\n");
            }
        }


    }
}
