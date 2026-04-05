package Classes.ExCLASSETEXTOQuadrado;

/*
Classe Quadrado: Crie uma classe que modele um quadrado:
Atributos: Tamanho do lado
Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área;

get ->   pegar  / retornar  / buscar um valor - getNomeVariavel
set -> alterar / modificar / definir um valor - setNomeVariavel

 */

public class Quadrado { // this se refere a classe Quadrado
    float lado;
    // construtor
    public Quadrado(float lado){
        this.lado = lado;
    }

    // metodo SET - mudar o valor do lado
    public void setValorLado(float novoValor){
        this.lado = novoValor;
    }

    // metodo  GET — retornar o valor do lado
    public float getLado(){
        return this.lado;
        //-> se fosse: return this.lado
        //public double getLado() {
        //    return this.lado;
        //}
    }

    // metodo calcular área
    public float calcularArea(){// o parenteses vazio significa que o metodo não recebe nenhum parâmetro
        return this.lado * this.lado; // area do quadrado = lado x lado
    }

}
