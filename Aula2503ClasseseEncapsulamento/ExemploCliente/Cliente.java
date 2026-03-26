package Aula2503ClasseseEncapsulamento.ExemploCliente;


public class Cliente {

    int idade;
    String nome;
    String email;

    Cliente(String nome, String email, int idade){
        this.nome = nome; // O "this" é usado para referenciar o atributo da classe,
                         // diferenciando-o do parâmetro do construtor
        this.email = email;
        this.idade = idade;
    }

    void mostrarCadastro(){
        System.out.println("----------");
        System.out.println("| ExemploCliente.Cliente: " + this.nome); // O "this" é usado para acessar os atributos
                                                                     // da classe dentro do metodo
        System.out.println("| Email: " + this.email);
        System.out.println("| Idade: " + this.idade);
        System.out.println("----------");
    }

    void mostrarCadastroSeMaiorDeIdade(){
        System.out.println("----------");
        if(this.idade >= 18) {
            System.out.println("| ExemploCliente.Cliente: " + this.nome);
            System.out.println("| Email: " + this.email);
            System.out.println("| Idade: " + this.idade);
        }else {
            System.out.println("*************");
        }
        System.out.println("----------");
    }

}
