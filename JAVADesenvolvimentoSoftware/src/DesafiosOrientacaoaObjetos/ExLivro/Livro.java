package DesafiosOrientacaoaObjetos.ExLivro;

/*
“Desenvolva a classe Livro com os atributos título, autor e ano. Implemente um construtor
para inicializar esses atributos quando um novo livro for instanciado no seu sistema.

Adicione um metodo exibirInfo() para mostrar todos os dados do livro na tela.”
 */

public class Livro {

    String autor;
    String titulo;
    int ano;


    // construtor
    public Livro (String autor, String titulo, int ano){
        this.autor = autor;
        this.titulo = titulo;
        this.ano = ano;
    }

    // metodo para exibir as informações do livro
    public void exibirInfoLivro(){
        System.out.println("=== Informações do Livro ===");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.ano);
    }

    // GET autor
    public String getAutor(){
        return this.autor;
    }

    // GET titulo
    public String getTitulo(){
        return this.titulo;
    }

    // GET ano
    public int getAno(){
        return this.ano;
    }




}
