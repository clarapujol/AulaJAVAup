package Aula2003;
import java.util.Scanner;


public class MainProduto2 {



    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Produto[] produtos = new Produto[5];

        // Adicionando produtos na lojinha
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("~~~~~~~~");
            System.out.println("Add Produto " + (i+1));

            System.out.print("Digite o nome do produto: ");
            String nome = leitor.nextLine();

            System.out.print("Digite o preço do produto: R$");
            float preco = Float.parseFloat( leitor.nextLine() ) ; /// --- \n

            System.out.print("Digite a quantidade de produtos: ");
            int quant = Integer.parseInt( leitor.nextLine() );
            leitor.nextLine();

            produtos[i] = new Produto(nome, preco, quant);
        }

        // Mostrando produtos da lojinha
        for (int i = 0; i < produtos.length; i++) {
            produtos[i].exibirInformacoesProduto();
        }



    }

}
