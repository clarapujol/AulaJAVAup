package Aula2703;

public class Pessoa {

    String nome;
    String telefone;

    Pessoa(String nome, String tel){
        this.nome = nome;
        this.telefone = tel;
    }

    void setNome(String novoNome){
        this.nome = novoNome;
    }

    String getNome(){
        return this.nome;
    }

}

/*
    A classe Pessoa é uma classe simples que possui dois atributos: nome e telefone. Ela tem um
    construtor que recebe o nome e o telefone como parâmetros, e também possui métodos para
    definir e obter o nome da pessoa.

    Exemplo de uso:

    public class Main {
        public static void main(String[] args) {
            Pessoa pessoa1 = new Pessoa("João", "123456789");
            System.out.println(pessoa1.getNome()); // Output: João

            pessoa1.setNome("Maria");
            System.out.println(pessoa1.getNome()); // Output: Maria
        }
    }

    Neste exemplo, criamos uma instância da classe Pessoa com o nome "João" e um número de telefone.
    Em seguida, usamos o metodo getNome() para imprimir o nome no console. Depois, usamos o metodo
    setNome() para alterar o nome para "Maria" e novamente imprimimos o nome atualizado.
*/
