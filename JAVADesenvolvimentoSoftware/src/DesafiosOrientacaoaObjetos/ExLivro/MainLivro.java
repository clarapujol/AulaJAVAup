package DesafiosOrientacaoaObjetos.ExLivro;
import java.util.Scanner;

public class MainLivro {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int opcao = 0;

        // array de livros para simular uma pequena biblioteca
        // tamanho fixo de 10 livros
        Livro[] biblioteca = new Livro[10];
        int totalLivros = 0; // contador de livros cadastrados

        System.out.println("\n=== Biblioteca ===");
        System.out.println("1 - Cadastrar livro");
        System.out.println("2 - Exibir todos os livros");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opção: ");
        opcao = leitor.nextInt();
        leitor.nextLine(); // limpa o buffer do teclado após nextInt()


        switch (opcao){
            case 1:
                if (totalLivros < 10) {
                    System.out.print("Digite o título do livro: ");
                    String titulo = leitor.nextLine();

                    System.out.print("Digite o autor do livro: ");
                    String autor = leitor.nextLine();

                    System.out.print("Digite o ano de publicação: ");
                    int ano = leitor.nextInt();
                    leitor.nextLine(); // limpa o buffer do teclado após nextInt()

                    // cria um novo livro e adiciona à biblioteca
                    Livro novoLivro = new Livro(autor, titulo, ano);
                    biblioteca[totalLivros] = novoLivro;
                    totalLivros++;

                    System.out.println("Livro cadastrado com sucesso!");
                } else {
                    System.out.println("Biblioteca cheia! Não é possível cadastrar mais livros.");
                }
                break;

            case 2:
                if (totalLivros > 0) {
                    System.out.println("\nNenhum livro cadastrado na biblioteca.");
                } else {
                    for (int i = 0; i < totalLivros; i++) {
                        biblioteca[i].exibirInfoLivro();
                    }
                }

                break;

            case 3:
                System.out.println("Saindo da biblioteca... Até mais!");
                break;

            default:
                System.out.println("Opção inválida!");
        }
        leitor.close();



    }

}
