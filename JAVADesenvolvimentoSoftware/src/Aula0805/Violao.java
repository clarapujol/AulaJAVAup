package Aula0805;

public class Violao extends Instrumento implements Afinador {

    Violao(String nome) {
        super(nome);
    }

    public void tocarMusicaCompleta(){
        System.out.println("Priririn piririn piririn alguem ligou pra mim");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando o Violão........");
    }

    @Override
    public void mudarTom(String tom) {
        System.out.println("Mudando tom do Violão para: " + tom);
    }

    @Override
    void tocar() {
        System.out.println("Tocando Violão...");
    }
}
