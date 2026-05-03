package POO.Esportes;

public class Corredor extends Atleta{
    public Corredor(String nome){
        super(nome);
    }

    @Override
    public void competir(){
        System.out.println("O Atleta " + nome + " está vencendo a corrida!");
    }
}
