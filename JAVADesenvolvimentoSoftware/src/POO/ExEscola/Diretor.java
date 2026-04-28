package POO.ExEscola;

// DESAFIO: crie uma classe Diretor que estende Pessoa
// e tem um metodo proprio chamarReuniao().

public class Diretor extends Pessoa {
    public Diretor(String nome){
        super(nome);
    }

    void chamarReuniao(){
        System.out.println("Diretor " + nome + " chamou para a reunião");
    }
}
