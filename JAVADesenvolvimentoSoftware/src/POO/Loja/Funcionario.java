package POO.Loja;

public class Funcionario  {
    String nome;

    public Funcionario(String nome){
        this.nome = nome;
    }

    void trabalhar(){
        System.out.println("Funcionario " + nome + " Está trabalhando...");
    }
}
