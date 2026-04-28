package POO.ExHeroi;

// ============================================================
// EXERCÍCIO 3 — Super-heróis
// Conceitos: extends, super(construtor), @Override
// ============================================================

public abstract class Heroi {
    String nome;

    public Heroi(String nome) {
        this.nome = nome;
    }

    public void atacar() {
        System.out.println("ATACADO CARAI");
    }

    void apresentar() {
        System.out.println("Saudações! eu sou " + nome);
    }

    void usarPoder() {
        System.out.println("USANDO PODER FODEROSO");
    }
}