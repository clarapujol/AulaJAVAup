package POO.Esportes;

// DESAFIO: crie um Ciclista que estende Atleta,
// passe o nome pelo super() e faça o @Override de competir().

public class Ciclista extends Atleta {
    public Ciclista(String nome){
        super(nome);
    }

    @Override
    public void competir(){
        System.out.println("O ciclista " + nome + " ultrapassou e está na primeira posição!");
    }
}
