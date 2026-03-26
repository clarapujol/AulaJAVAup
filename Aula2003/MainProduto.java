package Aula2003;
import java.util.Scanner;


public class MainProduto {



    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = leitor.nextLine();

        System.out.print("Digite o preço do produto: ");
        float preco = leitor.nextFloat();

        System.out.print("Digite a quantidade de produtos: ");
        int quantidade = leitor.nextInt();

        Produto p = new Produto(nome, preco, quantidade);
        p.exibirInformacoesProduto();


    }

}
