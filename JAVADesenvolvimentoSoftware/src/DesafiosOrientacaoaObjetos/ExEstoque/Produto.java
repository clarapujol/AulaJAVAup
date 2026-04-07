package DesafiosOrientacaoaObjetos.ExEstoque;

/*
“Como já deve ter entendido com os últimos exercícios, aqui você pode criar uma classe Produto
que contém as informações sobre cada item do
mercado, entre nome, código do produto, quantidade em estoque e preço.

Neste caso, não é necessário criar uma classe Mercado para gerenciar o estoque individual
de cadas mercado e pode-se utilizar a própria Main que faz o programa funcionar para isso.”
 */

public class Produto {

    private String nomeProduto;
    private int codigoProduto;
    private int quantidadeProduto;
    private double precoProduto;

    // construtor
    public Produto(String nome, int codigoProduto, int quantidade, double preco){
        this.nomeProduto = nomeProduto;
        this.codigoProduto = codigoProduto;
        this.quantidadeProduto = quantidade;
        this.precoProduto = precoProduto;
    }

    // GET - retornam os valores dos atributos privados
    public String getNome(){
        return this.nomeProduto;
    }

    public int getCodigoProduto(){
        return this.codigoProduto;
    }

    public int getQuantidade(){
        return this.quantidadeProduto;
    }

    public double getPreco(){
        return this.precoProduto;
    }


    // SET -  geralmente não retornam valores (são void)
    public void setPreco(double novoPreco){
        this.precoProduto = novoPreco;
    }

    public void setQuantidade(int novaQuantidade){
        this.quantidadeProduto = novaQuantidade;
    }

    // valor total desse produto no estoque (preco x quantidade)
    public double totalProduto(){
        return this.precoProduto * this.quantidadeProduto;
    }

    // exibir informações do produto
    public void exibirInfo(){
        System.out.println("Nome do produto: " + this.nomeProduto);
        System.out.println("Codigo: " + this.codigoProduto);
        System.out.println("Quantidade: " + this.quantidadeProduto);
        System.out.println("Preço: " + this.precoProduto);
        System.out.println("Quantidade em estoque: " + this.totalProduto());
    }
}
