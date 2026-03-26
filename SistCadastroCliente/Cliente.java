package SistCadastroCliente;

/*
 Uma empresa deseja criar um sistema de cadastro de clientes. O programa deve
 permitir a entrada de dados via teclado, como nome, endereço, telefone e email.
 O sistema deve armazenar as informações dos clientes em um array.
 */

public class Cliente {
    String nome;
    String email;
    int idade;

    Cliente(String cli, String em, int ida) {
        nome = cli;
        email = em;
        idade = ida;
    }

    void exibirInformacoesCliente() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Cliente: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Idade: " + idade);
    }

    void calcularMaiorIdade() {
        if (idade >= 18) {
            System.out.println("Produto " + nome + " é maior de idade.");
        }
    }
}