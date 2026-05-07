package Aula0605.DiagramaDeClasses.ExVeiculos2;

abstract public class Veiculo {
    private int ano;
    private String cor;
    private  String modelo;
    private boolean ligado;

    public Veiculo(int ano, String cor, String modelo, boolean ligado) {
        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
        this.ligado = false;
    }

    public abstract void ligar();

    public abstract void desligar();

}
