package Aula3004.RPG;

public class Arqueiro extends Personagem{

    public Arqueiro(String nome) {
        super(nome, 70, 60);
    }

    @Override
    public void atacar(){
        System.out.println("🏹 Arqueiro atacando FIIUUU ");
    }

    public String getArma(){
        return "Flecha";
    }
}
