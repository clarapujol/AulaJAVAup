package POO.Loja;

public class Caixa extends Funcionario{
    public Caixa(String nome){
        super(nome);
    }

    void registrarCompra(){
        System.out.println("Caixa " + nome + " Registrou a compra no caixa...");
    }
}
