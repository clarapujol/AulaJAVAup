package POO.Loja;

// DESAFIO: crie uma classe Gerente que estende Funcionario
// e tem um metodo proprio abrirLoja().

public class Gerente extends Funcionario{
    public Gerente(String nome){
        super(nome);
    }

    void abrirLoja(){
        System.out.println("Gerente " + nome + " Abriu a loja...");
    }
}
