package Aula3004.RPG;

public abstract class Personagem {
    protected String nome; // protected só pode ser acessada por
    // classes do mesmo pacote ou por classes filhas (herança)
    private int vida;


    private int dano;

    public Personagem(String nome, int vida, int dano) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }

    public abstract void atacar(); // metodo abstrato - não tem corpo, só tem a assinatura
    public abstract String getArma();

    public void receberDano(int dano){
        this.vida -= dano;
    }

    public boolean estaVivo(){
        return(this.vida > 0);
    }

    public int getDano() {
        return dano;
    }
}
