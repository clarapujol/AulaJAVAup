package POO.Restaurante;

// ============================================================
// EXERCÍCIO 4 — Restaurante
// Conceitos: extends, super (construtor), super.metodo(), @Override
// ============================================================

public class Prato {
    String nome;

    public Prato(String nome){
        this.nome = nome;
    }

    public void servir(){
        System.out.println("Servindo o prato: " + nome);
    }
}
