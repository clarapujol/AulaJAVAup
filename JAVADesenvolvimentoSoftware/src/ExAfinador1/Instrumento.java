package ExAfinador1;

public abstract class Instrumento {
    String nome;

    public Instrumento(String nome) {
        this.nome = nome;
    }

    abstract void tocar();
}
