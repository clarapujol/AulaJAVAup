package Classes.ExCLASSETEXTOPessoa;

/*
Classe Pessoa: Crie uma classe que modele uma pessoa:

Atributos: nome, idade, peso e altura

Métodos: Envelhecer, engordar, emagrecer, crescer. Obs: Por padrão, a cada ano que nossa
pessoa envelhece, sendo a idade dela menor que 21 anos, ela deve crescer 0,5 cm.
 */

public class Pessoa {
    String nome;
    int idade;
    float peso;
    float altura;

    // construtor
    public Pessoa(String nome, int idade, float peso, float altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    // pegar nome
    public String getNome(){
        return this.nome;
    }

    // pegar idade
    public int getIdade(){
        return this.idade;
    }

    // pegar peso
    public float getPeso(){
        return this.peso;
    }

    // pegar altura
    public float getAltura(){
        return this.altura;
    }

    //  Envelhecer - a cada ano, se idade < 21, cresce 0.5cm
    public void envelhecer(){
        this.idade = this.idade + 1; // ou this.idade += 1; ou this.idade++;
        if (this.idade < 21){
            this.altura += 0.005f; // ou this.altura = this.altura + 0.5f;
        }
    }

    // metodo engordar -> mudar o peso da pessoa
    public float setEngordar(float novoPeso){
        this.peso = novoPeso + this.peso; // ou this.peso += novoPeso;
        return novoPeso;
    }

    // metodo emagrecer -> mudar o peso da pessoa
    public float setEmagrecer(float novoPeso){
        this.peso = this.peso - novoPeso;
        return novoPeso;
    }

    // metodo crescer -> mudar a altura da pessoa
    public float setCrescer(float novaAltura){
        this.altura += novaAltura / 100; // ou this.altura = this.altura + novaAltura;
        return novaAltura;
    }
}
