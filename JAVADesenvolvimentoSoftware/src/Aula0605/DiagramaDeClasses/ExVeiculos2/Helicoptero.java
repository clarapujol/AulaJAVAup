package Aula0605.DiagramaDeClasses.ExVeiculos2;

import javax.xml.transform.Source;

public class Helicoptero extends Veiculo{

    private int numeroHelices;
    private float capacidadeCarga;

    public Helicoptero(int ano, String cor, String modelo, boolean ligado, int numeroHelices, float capacidadeCarga) {
        super(ano, cor, modelo, ligado);

        this.numeroHelices = numeroHelices;
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Helicoptero");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Helicoptero");
    }

    public void pairar(){
        System.out.println("Helicoptero pairando");
    }

    public void resgatarPessoas(){
        System.out.println("Helicoptero resgatando pessoas");
    }
}
