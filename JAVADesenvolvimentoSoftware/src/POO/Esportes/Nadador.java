package POO.Esportes;

public class Nadador extends Atleta{

    public Nadador(String nome) {
        super(nome);
    }

    @Override
    public void competir(){
        System.out.println("O nadador " + nome + " está nadando super bem!");
    }
}
