package Aula2003;

public class Produto {

    String nome;
    float preco;
    int quantidade;

    Produto(String n, float p, int q){
        nome = n;
        preco = p;
        quantidade = q;
    }

    void exibirInformacoesProduto(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Produto: " + nome);
        System.out.println("Preço $: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }


}
