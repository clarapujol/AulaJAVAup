package POO.Esportes;

// ============================================================
// EXERCÍCIO 3 — Esportes
// Conceitos: extends, super (construtor), @Override
// ===========================================================

public class Atleta {
    String nome;

    public Atleta(String nome){
        this.nome = nome;
    }

    public void competir(){ // é um metodo acessível publicamente que executa uma ação sem devolver dados
        System.out.println("O atleta " + nome + " está competindo!");
    }

    void treinar(){ // sozinho (em um metodo) apenas indica ausência de retorno
        System.out.println("O atleta " + nome + " está treinando!");
    }
}

