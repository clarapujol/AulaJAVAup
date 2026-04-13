package Prova.Ex1;

public class Termostato {
    private int temperaturaAtual;
    private int temperaturaDesejada;
    private boolean estaLigado = false;

    // construtor
    public Termostato(int temperaturaDesejada) {
        this.temperaturaAtual = 25;
        this.temperaturaDesejada = temperaturaDesejada;
        this.estaLigado = false;
    }

    // metodo
    void aumentarTemp() {
        this.temperaturaDesejada += 1;
        System.out.println("Temperatura desejada aumentada para: " + this.temperaturaDesejada);
    }

    void diminuirTemp(){
        this.temperaturaDesejada -= 1;
        System.out.println("Temperatura desejada diminuida para: " + this.temperaturaDesejada);
    }



    // GET e SET (alt + insert para ativar o atalho do get e set)
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

    public boolean isEstaLigado() { // o is significa está, ou seja isEstaligado(on)/ isOn
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    // exibir status
    void exibirStatus(){
        System.out.println("---Status---");
        System.out.println(" > Ligado " + this.estaLigado);
        System.out.println(" > Temperatura Atual: " + this.temperaturaAtual);
        System.out.println(" > Temperatura Desejada: " + this.temperaturaDesejada);
        System.out.println("------------");
    }
}
