package Aula0805;

public abstract class Instrumento {
    String nome;

    Instrumento(String nome) {
        this.nome = nome;
    }

    abstract void tocar();
}
