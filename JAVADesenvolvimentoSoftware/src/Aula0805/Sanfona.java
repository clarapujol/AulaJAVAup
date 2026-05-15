package Aula0805;

public class Sanfona extends Instrumento implements Afinador {
    public Sanfona(String nome) {
        super(nome);
    }

    @Override
    void tocar() {
        System.out.println("Tocando Sanfona...");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando Sanfona...");
    }

    @Override
    public void mudarTom(String tom) {
        System.out.println("Mudando tom da Sanfona para: " + tom);
    }
}


