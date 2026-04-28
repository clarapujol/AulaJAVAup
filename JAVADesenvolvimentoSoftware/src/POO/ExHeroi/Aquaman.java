package POO.ExHeroi;

// DESAFIO: crie um herói Aquaman que estende Heroi,
// passe o nome pelo super() e faça o @Override de usarPoder().

public class Aquaman extends Heroi{
    public Aquaman(){
        super("Aquaman");
    }

    @Override
    void usarPoder(){
        System.out.println("BLUP BLUP NADANDOOOO");
    }
}
