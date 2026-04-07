package DesafiosOrientacaoaObjetos.ExAgenda;
import java.util.Scanner;

public class MainAgenda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n=== Agenda ===");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Buscar contato");
            System.out.println("3 - Listar todos");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = leitor.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = leitor.nextLine();
                    agenda.adicionarContato(nome, telefone);
                    break;
                case 2:
                    System.out.print("Digite o nome para buscar: ");
                    String busca = leitor.nextLine();
                    agenda.buscarContato(busca);
                    break;
                case 3:
                    agenda.listarContatos();
                    break;
                case 4:
                    System.out.println("Encerrando agenda...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        leitor.close();
    }
}
