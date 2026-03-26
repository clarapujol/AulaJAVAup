package SistCadastroCliente;

import java.util.Scanner;

public class MainCliente {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        Cliente[] cliente = new Cliente[3];

//        clientes[0] = new Cliente();
//        clientes[0].nome = "João Silva";
//        clientes[0].telefone = "(11) 98765-4321";
//        clientes[0].email = "joaosilvapinto@oi.com";
//        clientes[0].idade = 30;

        for (int i = 0; i < cliente.length; i++) {
            System.out.println("~~~~~~~~");
            System.out.println("Add Cliente " + (i+1));

            System.out.print("Digite o nome do cliente: ");
            String nome = leitor.nextLine();

            System.out.print("Digite o telefone do cliente: ");
            String telefone = leitor.nextLine();

            System.out.print("Digite a idade do cliente: ");
            int idade = Integer.parseInt( leitor.nextLine() );

            cliente[i] = new Cliente(nome, telefone, idade); // equivale a cliente[i].nome = nome; cliente[i].telefone....
        }


        // Verificando se os clientes são maiores de idade
        for (int i = 0; i < cliente.length; i++) {
            cliente[i].calcularMaiorIdade();
        }

        System.out.println("\n~~~ lista de clientes MAIORES de idade ~~~");

        // Mostrando clientes cadastrados
        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i].idade >= 18) {
                cliente[i].exibirInformacoesCliente();
            }
        }

    }

}
