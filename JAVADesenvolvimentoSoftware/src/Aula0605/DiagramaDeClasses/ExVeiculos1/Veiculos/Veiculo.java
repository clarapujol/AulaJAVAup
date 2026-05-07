package Aula0605.DiagramaDeClasses.ExVeiculos1.Veiculos;

abstract public class Veiculo { //abstract é

    protected int ano;
    protected String cor;
    protected String modelo;
    protected boolean ligado;

    public Veiculo(int ano, String modelo, String cor) {
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        this.ligado = false;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void acelerar() {
        System.out.println("Vrum vrum");
    }

    public void frear() {
        System.out.println("Desacelerou");
    }

    abstract public void ligar();

    public void desligar() {
        this.ligado = false;
    }

    public void virar() {
        System.out.println("Virando");
    }

}
