package Classes.ExCLASSETEXTORetangulo;

/*
Classe Retangulo: Crie uma classe que modele um retangulo:

Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher)

Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular Área e calcular Perímetro;

Crie um programa que utilize esta classe. Ele deve pedir ao usuário que informe as medidades
de um local. Depois, deve criar um objeto com as medidas e calcular a quantidade de pisos e
de rodapés necessárias para o local.
 */

public class Retangulo {

    float base;
    float altura;

    // construtor
    public Retangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    // metodo mudar valor dos lados -> SET
    public void setmudarValorLados(float novaBase, float novaAltura){
        this.base = novaBase;
        this.altura = novaAltura;
    }

    // metodo retornar (MOSTRAR), valor dos lados, nao pode ser void porque ele retornaria os valores
    public float getBase(){
        return this.base;
    }

    public float getAltura(){
        return this.altura;
    }
    
    // metodo de calcular area
    public float calcularArea(){
        float calcularArea = this.base * this.altura;
        System.out.print("Area: " + calcularArea);
        return calcularArea;

        // ou
        // return this.base * this.altura;
    }

    // metodo de calcular perimetro
    public float calcularPerimetro(){
        return this.base + this.base + this.altura + this.altura;
        // perimetro do retangulo = 2 x base + 2 x altura
    }
}
