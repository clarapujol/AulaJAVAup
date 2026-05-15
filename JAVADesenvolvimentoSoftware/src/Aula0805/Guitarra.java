package Aula0805;

public class Guitarra extends Instrumento implements Afinador {
    Guitarra(String nome) {
        super(nome);
    }

    @Override
    void tocar() {
        System.out.println("Tocando Guitarra...");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando o Guitarra........");
    }

    @Override
    public void mudarTom(String tom) {
        System.out.println("Mudando tom do Guitarra para: " + tom);
    }
}
