package Aula3004;

import Aula3004.RPG.Arqueiro;
import Aula3004.RPG.Guerreiro;
import Aula3004.RPG.Mago;
import Aula3004.RPG.Personagem;

public class Main {
    public static void main(String[] args){
//        Personagem p = new Personagem("nome", 100);
//        Mago m = new Mago("Maguito");
//        Arqueiro a = new Arqueiro("Arqueiro");
//        Guerreiro g = new Guerreiro("Guerreiro");

        // fazer um array de Personagem e chamar para atacar em todo mundo
        Personagem[] personagens = new Personagem[3];

        // polimorfismo - consegue  juntar pessoas diferentes dentro do mesmo array
        personagens[0] = new Mago("Jusé");
        personagens[1] = new Arqueiro("Kiito");
        personagens[2] = new Guerreiro("Padinha");
//      personagens[3] = new Guerreiro();
//      personagens[4] = new Guerreiro();

        // se todos eles sao personagens e todos eles atacam, eu consigo fazer um for que
        // percorre a minha lista de personagens e pra cada personagem, eu consigo falar pra ele
        // atacar! (olha aí)
//        for (int i = 0; i < personagens.length; i++) {
//            personagens[i].atacar();
//        }

        // atacando entre si
        personagens[0].atacar();
        personagens[2].receberDano(personagens[0].getDano());
        System.out.println(personagens[2].estaVivo());;



//        p.atacar();
//        m.atacar();
//        a.atacar();
//        g.atacar();

    }
}
