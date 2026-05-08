package Aula3004.RPG;

public class Guerreiro extends Personagem{

    public Guerreiro(String nome) {
        super(nome, 100, 90);
    }

    @Override
    public void atacar(){
        System.out.println("⚔️ Guerreiro atacando POW POW POW");
    }

    public String getArma(){
        return "Espada";
    }
}
