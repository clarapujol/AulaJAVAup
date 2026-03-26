package Aula2503ClasseseEncapsulamento.ExemploCliente;
import java.util.Scanner;


public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        Cliente[] meusClientes = new Cliente[2];

        // FAZER CADASTRO
        for (int i = 0; i < meusClientes.length; i++) {

            System.out.print("Digite o nome: ");
            String nome = scan.nextLine(); // O "scan.nextLine()" é usado para ler uma linha de texto do usuário,
                                          // permitindo que ele insira o nome completo, incluindo espaços, sem problemas.

            System.out.print("Digite o email: ");
            String email = scan.nextLine();

            System.out.print("Digite a idade");
            int idade = scan.nextInt();
            scan.nextLine();

            // ExemploCliente.Cliente novoCliente = new ExemploCliente.Cliente(nome, email, idade);
            // meusClientes[i] = novoCliente;

            meusClientes[i] = new Cliente(nome, email, idade);

        }


        // MOSTRAR CLIENTES
        for (int i = 0; i < meusClientes.length; i++) {

            if(meusClientes[i].idade >= 18){
                meusClientes[i].mostrarCadastro();
            }

        }



        // novoCliente.mostrarCadastroSeMaiorDeIdade();


    }


}
