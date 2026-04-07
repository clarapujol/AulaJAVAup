package DesafiosOrientacaoaObjetos.ExEstoque;
import java.util.Scanner;



public class MainEstoque {

    public static void main(String[] args){
        Scanner leitor = new Scanner (System.in);

        Produto[] estoque = new Produto[50];
        int totalProdutos = 0;

        int opcao = 0;

        while (opcao != 4){
            System.out.println("---Bem-Vindo(a) ao MercadinhoDiCria---");
            System.out.println("1- Adicionar produto: ");
            System.out.println("2- Atualizar produto: ");
            System.out.println("3- Remover Produto: ");
            System.out.println("4- Relatorio do estoque: ");
            System.out.print("Escolha: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao){
                case 1 :
                    // adicionar novo produto
                    System.out.println("Nome do produto: ");
                    String nomeProduto = leitor.nextLine();

                    System.out.println("Codigo: ");
                    int codigoProduto = leitor.nextInt();

                    System.out.println("Quantidade: ");
                    int quantidadeProduto = leitor.nextInt();

                    System.out.println("Preço: ");
                    double precoProduto = leitor.nextDouble();
                    leitor.nextLine();

                    estoque[totalProdutos] = new Produto(nomeProduto, codigoProduto, quantidadeProduto, precoProduto);


            }
        }

    }

}
