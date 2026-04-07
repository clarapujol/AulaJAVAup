package DesafiosOrientacaoaObjetos.ExCarro;
import java.util.Scanner;


public class MainCarro {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("=== Bem vindo ao sistema de controle de carros! ===");
        System.out.println("Digite a marca do carro: ");
        String marca = leitor.nextLine(); // ler a marca do carro digitada pelo usuário

        System.out.println("Digite o modelo do carro: ");
        String modelo = leitor.nextLine();

        System.out.println("Digite o ano do carro: ");
        int ano = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Digite a placa do carro: ");
        String placa = leitor.nextLine();

        Carro car = new Carro(marca, modelo, ano, placa);
        System.out.println("Carro criado com sucesso!");

        int opcao = 0;

        while (opcao != 4){
            System.out.println("\n----- Opções -----");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Exibir informações do carro");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o valor da aceleração:");
                    int valorAceleracao = leitor.nextInt(); // LÊ o valor da aceleração
                    // digitado pelo usuário e armazena na variável valorAceleracao
                    car.acelerar(valorAceleracao); // CHAMA o metodo acelerar da classe Carro,
                    // passando o valor da aceleração como parâmetro
                    break;

                case 2:
                    System.out.println("Digite o valor da frenagem: ");
                    int valorFrenagem = leitor.nextInt(); // LÊ o valor da frenagem
                    // digitado pelo usuário e armazena na variável valorFrenagem
                    car.frear(valorFrenagem); // CHAMA o metodo frear da classe Carro,
                    // passando o valor da frenagem como parâmetro
                    break;

                case 3:
                    car.exibirInformacoes(); // CHAMA o metodo exibirInformacoes da
                    // classe Carro para exibir as informações do carro
                    break;

                case 4:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        leitor.close();

    }

}
