package POO.ExEscola;

public class Professor extends Pessoa{
    public Professor(String nome){
        super(nome);
    }

    void aplicarAula(){
        System.out.println("Professor " + nome + " está dando aula...");
    }
}
