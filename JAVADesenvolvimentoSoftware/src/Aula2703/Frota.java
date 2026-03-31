package Aula2703;

import java.util.ArrayList;
import java.util.List;

public class Frota {

    String batalhao;
    List<Nave> minhasNaves = new ArrayList<>();

    void criarNaves(){
        Nave n1 = new Nave("Abelhao");
        Nave n2 = new Nave("Zangao");
        Nave n3 = new Nave("Vezpao");
        Nave n4 = new Nave("Mosquitao");

        adicionarNave(n1);
        adicionarNave(n2);
        adicionarNave(n3);
        adicionarNave(n4);
    }

    void adicionarNave(Nave novaNave){
        minhasNaves.add(novaNave);
    }

    void destruir(){
        minhasNaves.clear();
    }

    void verNaves(){
        System.out.println("Vendo as naves: ");
        for (int i = 0; i < minhasNaves.size(); i++) {
            System.out.println(" - " +  minhasNaves.get(i).nome );
        }
        System.out.println("...Fim das Naves");
    }

}


/* Em resumo, esse código define uma classe Frota que representa uma frota de naves.
A classe possui um atributo para o nome do batalhão e uma lista para armazenar as naves.
Ela tem métodos para criar naves, adicionar naves à frota, destruir a frota (limpando a
lista de naves) e visualizar as naves presentes na frota. O metodo criarNaves() instancia
algumas naves e as adiciona à frota, enquanto o metodo verNaves() exibe os nomes das naves
presentes na frota. */