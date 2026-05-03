package POO.Loja;

public class Estoquista extends Funcionario{
    public Estoquista(String nome){
        super(nome);
    }

    void organizarEstoque(){
        System.out.println("Estoquista " + nome + " Organizou o estoque...");
    }
}
