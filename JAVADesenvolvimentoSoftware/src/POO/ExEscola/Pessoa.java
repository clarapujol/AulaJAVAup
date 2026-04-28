package POO.ExEscola;

// ============================================================
// EXERCÍCIO 2 — Escola
// Conceitos: extends, super (construtor), métodos próprios
// ============================================================

public class Pessoa {
        String nome;

        public Pessoa(String nome){
            this.nome = nome;
        }

        void apresentar(){
            System.out.println("Olá, meu nome é " + nome);
        }

}
