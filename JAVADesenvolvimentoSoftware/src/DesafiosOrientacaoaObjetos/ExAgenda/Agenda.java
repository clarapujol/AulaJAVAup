package DesafiosOrientacaoaObjetos.ExAgenda;

/*
“Crie as classes Agenda e Contato em Java.
A classe Contato deve armazenar informações como nome e telefone,

enquanto a classe Agenda deve gerenciar uma lista de contatos, com métodos para adicionar
novos contatos e buscar contatos por nome.”
 */

public class Agenda {
    // array que guarda até 100 contatos
    Contato[] contatos = new Contato[100]; //array indica
    int totalContatos = 0; // quantos contatos foram adicionados

    // adicionar novo contato na agenda
    public void adicionarContato(String nome, String telefone){
        if (totalContatos < 100) {
            // cria um novo objeto Contato e salva no array
            contatos[totalContatos] = new Contato(nome, telefone);
            totalContatos++;
            System.out.println("Contato adicionado!");
        } else {
            System.out.println("Agenda cheia!");
        }

    }

    // buscar contato pelo nome
    public void buscarContato(String nome) {
        boolean encontrado = false;

        // percorre todos os contatos procurando o nome
        // "equalsIgnoreCase" compara ignorando maiúsculas/minúsculas
        for (int i = 0; i < totalContatos; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                contatos[i].exibirInfo();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Contato não encontrado!");
        }
    }

    // listar todos os contatos
    public void listarContatos() {
        if (totalContatos == 0) {
            System.out.println("Agenda vazia!");
        } else {
            System.out.println("\n--- Todos os contatos ---");
            for (int i = 0; i < totalContatos; i++) {
                contatos[i].exibirInfo();
            }
        }
    }

}
