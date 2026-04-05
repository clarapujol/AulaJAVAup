package DesafiosOrientacaoaObjetos.ExContaBancaria;
import java.util.Scanner;

/*
!= -> operador de comparação que verifica se dois valores são diferentes, ou seja, se o
valor do saque é diferente do saldo disponível, não permite sacar mais do que tem

&& -> operador lógico AND, ou seja, as duas condições precisam ser verdadeiras para que o
 */

public class MainContaBancaria {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("=== Bem vindo ao Banco! ===");
        System.out.println("Digite o número da conta: ");
        int numeroConta = leitor.nextInt(); // ler o número da conta digitado pelo usuário e armazenar na variável numeroConta
        leitor.nextLine();

        System.out.println("Digite o nome do titular: ");
        String nomeTitular = leitor.nextLine(); // ler o nome do titular digitado pelo usuário e armazenar na variável nomeTitular

        ContaBancaria contaBanc = new ContaBancaria(numeroConta, nomeTitular);
        System.out.println("Conta criada com sucesso!");

        int opcao = 0;

        while (opcao != 4){ // enquanto a opção escolhida for diferente de 4 (sair),
            // o menu será exibido e o usuário poderá escolher as opções disponíveis
            System.out.println("\n--- Menu ---");
            System.out.println("Titular: " + contaBanc.getNomeTitular());
            System.out.println("Saldo atual: R$ " + contaBanc.getSaldo());
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o valor do deposito: ");
                    double valorDeposito = leitor.nextDouble();
                    // ler o valor do depósito digitado pelo usuário e armazenar na variável valorDeposito
                    contaBanc.depositar(valorDeposito);
                    // chamar o metodo depositar da classe ContaBancaria, passando o valor do deposito
                    // como parâmetro
                    break;

                case 2:
                    System.out.println("Digite o valor do saque:");
                    double valorSaque = leitor.nextDouble();
                    // ler o valor do saque digitado pelo usuário e armazenar na variável
                    // valorSaque
                    contaBanc.sacar(valorSaque, contaBanc.getSaldo());
                    // chamar o metodo sacar da classe ContaBancaria, passando o valor do saque e
                    // o saldo atual da conta como parâmetros
                    break;

                case 3:
                    System.out.println("Saldo atual:" + contaBanc.getSaldo());
                    // chamar o metodo getSaldo da classe ContaBancaria para exibir o saldo atual
                    break;

                case 4:
                    System.out.println("Obrigado por usar o Banco! Até mais!");
                    // mensagem de despedida ao usuário quando ele escolher a opção de sair
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    // mensagem de erro caso o usuário escolha uma opção que não está disponível no menu

            }
        }
        leitor.close();
    }

}
