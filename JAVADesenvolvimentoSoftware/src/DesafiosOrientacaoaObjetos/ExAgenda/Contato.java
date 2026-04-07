package DesafiosOrientacaoaObjetos.ExAgenda;

/*
“Crie as classes Agenda e Contato em Java.
A classe Contato deve armazenar informações como nome e telefone,

enquanto a classe Agenda deve gerenciar uma lista de contatos, com métodos para adicionar
novos contatos e buscar contatos por nome.”
 */

public class Contato{
    // atributos do contato
    String nome; //
    String telefone;

    // constutor
    public Contato (String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    // GET
    public String getNome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

    // exibir informações do contato
    public void exibirInfo (){
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone: " + this.telefone);
    }

}
