package Prova.Ex1;

public class Termostato {

    private int temperaturaAtual = 25; // (inicie com 25°C)
    private int temperaturaDesejada;
    private boolean estaLigado = false;

    Termostato(int temDes){
        this.temperaturaAtual = 25; // ??
        this.temperaturaDesejada = temDes;
        estaLigado = false; // ??
    }

    void aumentarTemp(){
        this.temperaturaDesejada += 1;
        System.out.println("Temp. desejada aumentada para: " + this.temperaturaDesejada);
    }

    void diminuirTemp(){
        this.temperaturaDesejada -= 1;
        System.out.println("Temp. desejada diminuida para: " + this.temperaturaDesejada);
    }

    void exibirStatus(){
        // mostrar se o aparelho está ligado, a temperatura atual do quarto e a meta definida.
        System.out.println("--- Status:");
        System.out.println(" > Ligado: " + this.estaLigado);
        System.out.println(" > Temp Atual: " + this.temperaturaAtual);
        System.out.println(" > Temp Des: " + this.temperaturaDesejada);
        System.out.println("-----------");
    }


    public int getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(int temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public int getTemperaturaDesejada() {
        return temperaturaDesejada;
    }

    public void setTemperaturaDesejada(int temperaturaDesejada) {
        this.temperaturaDesejada = temperaturaDesejada;
    }

    public boolean isEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

}
