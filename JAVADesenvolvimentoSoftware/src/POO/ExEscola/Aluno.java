package POO.ExEscola;

public class Aluno extends Pessoa{

    public Aluno(String nome){
        super(nome); // chama o construtor de Pessoa passando o nome
    }

    void estudar(){
        System.out.println("Aluno(a) " + nome + " está estudando...");
    }
}
