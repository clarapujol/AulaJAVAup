package Aula3004.RPG;

public class Mago extends Personagem{

    public Mago(String nome) {
        super(nome, 50, 10);
    }

    @Override
    public void atacar(){
        System.out.println("🪄 Maguito "+ this.nome +" atacando SHUIIII");
    }

    public String getArma(){
        return "Feitiço";
    }
}
