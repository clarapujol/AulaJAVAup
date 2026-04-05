package DesafiosOrientacaoaObjetos.ExJogador;
import java.util.Scanner;
/*
Crie a classe `Jogador`, que deverá conter atributos privados para o
`nome`, `pontuacao` e `nivel` do jogador.
 */


public class MainJogador {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("=== Bem vindo ao jogo! ===");
        System.out.println("Insira as informações do jogador:");
        System.out.println("Nome: ");
        String nome = leitor.nextLine();

//        System.out.println("Pontuação: ");
//        int pontuacao = leitor.nextInt();
//
//        System.out.println("Nível: ");
//        int nivel = leitor.nextInt();

        // cria o jogador com o nome informado
        Jogador jog = new Jogador(nome);
        System.out.println("Jogador criado com sucesso!");
        jog.exibirInformacoes();

        int opcao = 0;

        while (opcao != 4){
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Aumentar pontuação");
            System.out.println("2 - Subir de nível");
            System.out.println("3 - Exibir informações do jogador");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = leitor.nextInt();
        }

        switch (opcao){
            case 1:
                System.out.println("Digite a quantidade de pontos a serem adicionados: ");
                int pontos = leitor.nextInt(); // LÊ a quantidade de pontos a serem adicionados
                // à pontuação do jogador e armazenar na variável pontos
                jog.aumentarPontuacao(pontos); // CHAMA o metodo aumentarPontuacao da classe
                // Jogador, passando a quantidade de pontos a serem adicionados como parâmetro
                break;

            case 2:
                jog.subirNivel(); // CHAMA o metodo subirNivel da classe Jogador para subir
                // o nível do jogador
                break;

            case 3:
                jog.exibirInformacoes(); // CHAMA o metodo exibirInformacoes da classe Jogador para
                // exibir as informações do jogador
                break;

            case 4:
                System.out.println("Saindo do jogo. Até a próxima!");
                break;

            default:
                System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
        }
        leitor.close(); // FECHA o scanner para evitar vazamento de recursos
    }

}
