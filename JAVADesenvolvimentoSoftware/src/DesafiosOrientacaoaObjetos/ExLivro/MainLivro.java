package DesafiosOrientacaoaObjetos.ExLivro;
import java.util.Scanner;

public class MainLivro {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        // criar um array para armazenar os livros
        int opcao = 0;
        Livro[] biblioteca = new Livro[10];
        int totalLivros = 0; // contador de livros cadastrados

        while (opcao != 3){
            System.out.println("\n---Cadastrar Livro---");
            System.out.println("Nome do livro");
            System.out.println("Nome do autor livro");
            System.out.println("Ano do livro");
            System.out.println("Escolha: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao){
                case 1:
                    // verifica se a biblioteca ainda tem espaço (array)
                    if (totalLivros < 10){
                        System.out.println("---Cadastrar Livro---");
                        System.out.println("Livro: ");
                        String titulo = leitor.nextLine();

                        System.out.println("Autor do Livro: ");
                        String autor = leitor.nextLine();

                        System.out.println("Ano do Livro");
                        int ano = leitor.nextInt();


                        // cria um novo objeto Livro e salva no array
                        biblioteca[totalLivros] = new Livro(titulo, autor, ano);
                        totalLivros++;
                        System.out.println("Livro cadastrado com sucesso!");
                    }else {
                        System.out.println("Sorry! Biblioteca cheia!");
                    }

                case 2:
                    // info do livro
                    if (totalLivros == 0){ // quando nao tiver nenhum livro cadastrado
                        System.out.println("Nenhum Livro cadastrado");
                    }else {
                        // percorre o array e exibe as informações de cada livro
                        for (int i = 0; i < totalLivros; i++) {
                            biblioteca[i].exibirInfo();
                        }
                    }

                case 3:
                    System.out.print("Encerrando a biblioteca...");

                default:
                    System.out.println("Opção inválida!");
            }
        }
        leitor.close();
    }
}
