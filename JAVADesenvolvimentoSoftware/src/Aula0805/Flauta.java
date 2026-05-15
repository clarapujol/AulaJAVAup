package Aula0805;

public class Flauta extends Instrumento implements Afinador {

    Flauta(String nome) {
        super(nome);
    }

    @Override
    public void afinar() {
        System.out.println("Afinando Flauta...");
    }

    @Override
    public void mudarTom(String tom) {
        System.out.println("Mudando tom da Flauta para: " + tom);
    }

    @Override
    void tocar() {
        System.out.println("Tocando Flauta...");
    }
}
