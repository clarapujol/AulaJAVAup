package DesafiosOrientacaoaObjetos.ExCarro;

/*
“Desenvolva a classe ‘Carro’ com atributos privados para ‘marca’, ‘modelo’, ‘ano’, ‘placa’
e ‘velocidadeAtual’.

Implemente um construtor para inicializar os atributos do carro quando um novo objeto é criado.

Adicione métodos públicos para `acelerar()`, que aumenta a velocidade do carro, e `frear()`,
que diminui a velocidade.

Não esqueça de incluir um metodo para exibir as informações do carro, refletindo a importância
da encapsulação e da interação entre os objetos em um programa orientado a objetos.”
 */

import java.security.PrivateKey;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double velocidadeAtual;//double para permitir valores decimais, caso seja necessário

    // construtor
    public Carro(String marca, String modelo, int ano, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0; // velocidade inicial do carro é zero,
        // independentemente do valor passado como parâmetro
    }

    // GET - retornam os valores dos atributos privados
    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getAno(){
        return this.ano;
    }

    public String getPlaca(){
        return this.placa;
    }

    public double getVelocidadeAtual(){
        return this.velocidadeAtual;
    }

    // metodo para acelerar o carro, aumenta a velocidade do carro
    public void acelerar(double valor){ // metodo para acelerar o carro, recebe o valor da aceleração como parâmetro
        if (valor > 0){
            this.velocidadeAtual = velocidadeAtual + valor; // velocidade atual + valor de aceleração
            System.out.println("Aceleração de " + valor + "km/h realidada! " + "Velocidade atual: " + this.velocidadeAtual + "km/h");
        }else {
            System.out.println("Valor de aceleração inválido! O valor deve ser maior que zero.");
        }
    }

    // metodo para frear o carro, diminui a velocidade do carro
    public void frear(double valor) { // metodo para frear o carro, recebe o valor da frenagem como parâmetro
        if (this.velocidadeAtual == 0) { // carro já está parado, não pode frear mais
            System.out.println("O carro já está parado!");
        } else {
            this.velocidadeAtual = velocidadeAtual + valor; // velocidade atual + valor de frenagem (valor negativo para diminuir a velocidade)
            if (this.velocidadeAtual < 0) { // velocidade não pode ser negativa
                this.velocidadeAtual = 0; // se a velocidade for menor que zero, ela é ajustada para zero
            }
            System.out.println("Freando! Velocidade atual de: " + this.velocidadeAtual + "km/h");
        }
    }

    // metodo para exibir as informações do carro
    public void exibirInformacoes(){
        System.out.println("--- Informações do Carro ---");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Placa: " + this.placa);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual + "km/h.");
    }
}




