package DesafiosOrientacaoaObjetos.ExLivro;

/*
“Desenvolva a classe Livro com os atributos título, autor e ano. Implemente um construtor
para inicializar esses atributos quando um novo livro for instanciado no seu sistema.

Adicione um metodo exibirInfo() para mostrar todos os dados do livro na tela.”
 */

public class Livro {

    String titulo;
    String autor;
    int ano;

    // construtor
    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    // metodo que exibe todas as informações do livro
    public void exibirInfo(){
        System.out.println("Informacões do livro");
        System.out.println("1- Titulo do Livro: " + this.titulo);
        System.out.println("2- Autor do Livro: " + this.autor);
        System.out.println("3- Ano de lançamento do livro: " + this.ano);
    }

    // GET - para acessar os atributos de fora da classe
    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public int getAno(){
        return this.ano;
    }


}
