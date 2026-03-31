package Aula2703;

public class Nave {

    String nome;

    Nave(String nome){
        this.nome = nome;
    }

}

/*
    A classe Nave é uma classe simples que possui um atributo nome e um construtor que recebe o
    nome como parâmetro. Ela pode ser utilizada para criar objetos do tipo Nave, que podem
    representar diferentes naves espaciais com seus respectivos nomes.

    Exemplo de uso:

    public class Main {
        public static void main(String[] args) {
            Nave nave1 = new Nave("Millennium Falcon");
            Nave nave2 = new Nave("X-Wing");

            System.out.println(nave1.nome); // Output: Millennium Falcon
            System.out.println(nave2.nome); // Output: X-Wing
        }
    }

    Neste exemplo, criamos duas instâncias da classe Nave, cada uma com um nome diferente, e
    imprimimos os nomes no console.
*/
