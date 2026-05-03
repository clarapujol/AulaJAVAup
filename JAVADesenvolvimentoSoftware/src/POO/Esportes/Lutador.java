package POO.Esportes;

public class Lutador extends Atleta{
    public Lutador(String nome){
        super(nome);
    }

    @Override
    public void competir(){
        System.out.println("O lutador " + nome + " está vencendo a luta!");
    }
}
