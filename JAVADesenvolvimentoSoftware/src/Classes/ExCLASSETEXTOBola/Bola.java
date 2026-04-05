package Classes.ExCLASSETEXTOBola;

/*
Classe Bola: Crie uma classe que modele uma bola:
Atributos: Cor, circunferência, material
Métodos: trocaCor e mostraCor
 */

public class Bola {
    String cor;
    Float circunferencia;
    String material;

    // construtor
    public Bola(String cor, Float circunferencia, String material){ // o this significa "desta bola específica"
        this.cor = cor; // this.cor = cor → "a cor desta bola recebe o valor que veio como parâmetro"
        this.circunferencia = circunferencia;
        this.material = material;
    }

    // metodo trocaCor
    public void trocaCor(String novaCor){ // void → não retorna nada, só executa uma ação
        this.cor = novaCor;
        //String novaCor → recebe a nova cor como parâmetro
        //this.cor = novaCor → substitui a cor antiga pela nova
    }

    // metodo mostraCor
    public void mostraCor() { // Não recebe nada como parâmetro
        System.out.println("A cor da bola é: " + this.cor); //+ this.cor → junta o texto com o valor da cor atual


    }
}
