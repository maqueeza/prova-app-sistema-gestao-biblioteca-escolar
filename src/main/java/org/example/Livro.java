package org.example;

import java.sql.SQLOutput;

public class Livro {
        private int codigo;
        private String titulo;
        private String autor;


        public Livro (int codigo, String titulo, String autor){
            setCodigo(codigo);
            setTitulo(titulo);
            setAutor(autor);
        }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
            if(codigo > 0){
                this.codigo = codigo;
            }else{
                System.out.println("Código inválido!");
            }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo != null && !titulo.isBlank()){
            this.titulo = titulo;
        }else{
            System.out.println("Título inválido!");
        }

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
            if(autor != null && !autor.isBlank()){
                this.autor = autor;
            }else{
                System.out.println("Autor inválido!");
            }

    }

    public void exibirDados(){
        System.out.println("Código: " + getCodigo());
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
    }
}

// Atributos:
//
//codigo;
//titulo;
//autor.



//Validações:
//
//não permitir cadastrar código menor ou igual a zero;
//não permitir título vazio;
//não permitir autor vazio;
//cada livro deve possuir um código único.