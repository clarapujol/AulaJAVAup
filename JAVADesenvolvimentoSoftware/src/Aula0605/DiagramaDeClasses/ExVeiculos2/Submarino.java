package Aula0605.DiagramaDeClasses.ExVeiculos2;

public class Submarino extends Veiculo{

    private float profundidadeMaxima;

    public Submarino(int ano, String cor, String modelo, boolean ligado, float profundidadeMaxima) {
        super(ano, cor, modelo, ligado);

        this.profundidadeMaxima = profundidadeMaxima;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Submarino");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Submarino");
    }

    public void mergulhar() {
        System.out.println("Submarino mergulhando");
    }

    public void emergir(){
        System.out.println("Submarino emergindo");
    }
}
