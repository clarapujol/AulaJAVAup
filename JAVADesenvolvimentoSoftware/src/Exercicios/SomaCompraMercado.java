package Exercicios;
import java.util.Scanner;

/*
O usuário informa o número de produtos que deseja comprar. Em
seguida, informa o preço de cada produto. O programa deve calcular
o total da compra.
Dica: Use um for para iterar sobre os produtos.

+= -> significa "adicionar e atribuir", ou seja, totalCompra += precoProduto é equivalente
a totalCompra = totalCompra + precoProduto, ou seja, o preço do produto é adicionado ao total
da compra a cada iteração do loop for.
 */


public class SomaCompraMercado {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos produtos deseja comprar? ");
        int numProdutos = leitor.nextInt();
        float precoProduto;
        float totalCompra = 0;

        for (int i = 1; i <= numProdutos; i++){
            System.out.println("Digite o preço do produto: " + i);
            precoProduto = leitor.nextFloat();
            totalCompra = totalCompra + precoProduto; // totalCompra += precoProduto
        }

        System.out.println("O total da compra é: R$ " + totalCompra);
    }
}
