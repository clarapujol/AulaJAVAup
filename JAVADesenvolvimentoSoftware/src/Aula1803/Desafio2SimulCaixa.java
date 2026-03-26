package Aula1803;
import java.util.Scanner;
//Crie um programa que simule um caixa eletrônico, onde o usario tem um saldo inicial
// e pode escolher uma operação: sacar, depositar ou consultar saldo. O programa deve continuar rodando
// até que o usuário escolha a opção de sair.
// Caso a opcão 2 seja escolhida, o programa deve verificar se há saldo suficiente
public class Desafio2SimulCaixa {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o saldo atual: ");
        float saldo = leitor.nextFloat();

        System.out.print("Escolha uma operação:\n 1 - Sacar,\n 2 - Depositar,\n 3 - Consultar saldo,\n 4 - Sair: ");
        int opcao = leitor.nextInt();
        // LOOP PRINCIPAL: Continua executando enquanto o usuário não escolher a opção 4 (sair)
        while (opcao != 4) {
            // ESTRUTURA DE DECISÃO: Verifica qual opção o usuário escolheu
            switch (opcao) {
                // CASO 1: Operação de saque
                case 1:
                    // Solicita ao usuário o valor que deseja sacar
                    System.out.print("Digite o valor a sacar: ");
                    // Lê o valor digitado e armazena na variável valorSaque
                    float valorSaque = leitor.nextFloat();
                    // Verifica se o valor a sacar é menor ou igual ao saldo disponível
                    if (valorSaque <= saldo) {
                        // Se sim, subtrai o valor do saque do saldo
                        saldo -= valorSaque;
                        // Exibe mensagem de sucesso com o novo saldo
                        System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
                    } else {
                        // Se não, exibe mensagem de erro (saldo insuficiente)
                        System.out.println("Saldo insuficiente para realizar o saque.");
                    }
                    // Encerra o caso 1 e sai do switch
                    break;

                // CASO 2: Operação de depósito
                case 2:
                    // Solicita ao usuário o valor que deseja depositar
                    System.out.print("Digite o valor a depositar: ");
                    // Lê o valor digitado e armazena na variável valorDeposito
                    float valorDeposito = leitor.nextFloat();
                    // Adiciona o valor do depósito ao saldo
                    saldo += valorDeposito;
                    // Exibe mensagem de sucesso com o novo saldo
                    System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);
                    // Encerra o caso 2 e sai do switch
                    break;

                // CASO 3: Consulta de saldo
                case 3:
                    // Simplesmente exibe o saldo atual
                    System.out.println("Saldo atual: " + saldo);
                    // Encerra o caso 3 e sai do switch
                    break;

                // CASO PADRÃO: Se nenhuma das opções válidas for escolhida
                default:
                    // Exibe mensagem informando que a opção é inválida
                    System.out.println("Opção inválida. Tente novamente.");
            }

            // Exibe o menu de opções novamente para o usuário escolher a próxima operação
            System.out.print("Escolha uma operação:\n 1 - Sacar,\n 2 - Depositar,\n 3 - Consultar saldo,\n 4 - Sair: ");
            // Lê a opção digitada pelo usuário
            opcao = leitor.nextInt();
        }

        // Quando o usuário escolhe 4 (sair), o loop termina e exibe a mensagem de despedida
        System.out.println("Obrigado por usar o caixa eletrônico. Até logo!");

        // Fecha o scanner para liberar o recurso
        leitor.close();
    }
}

