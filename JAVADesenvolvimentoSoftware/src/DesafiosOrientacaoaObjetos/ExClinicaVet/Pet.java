package DesafiosOrientacaoaObjetos.ExClinicaVet;

/*
Crie uma classe Pet com atributos privados nome, especie, idade e peso.

Implemente um construtor para inicializar esses atributos.

Adicione métodos aniversario() — que envelhece o pet em 1 ano e, se a idade for menor que 2,
aumenta 0,5kg no peso —,

engordar(float kg),
emagrecer(float kg) e
exibirInfo().

Crie um programa MainPet com um menu em loop que permita ao usuário cadastrar pets,
listar todos, buscar por nome e realizar operações.
 */

public class Pet {

    private String nome;
    private String especie;
    private int idade;
    private float peso;


    // construtor
    public Pet(String nome, String especie, int idade, float peso){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    // GET - retornam os valores dos atributos privados
    public String getNome(){
        return this.nome;
    }

    public String getEspecie(){
        return this.especie;
    }

    public int getIdade(){
        return this.idade;
    }

    public float getPeso(){
        return this.peso;
    }

    // metodo de aniversario, envelhecer 1 ano
    // se a idade ainda for menor que 2, o pet cresce 0,5kg
    public void envelhecerPet(){
        this.idade = this.idade + 1;
        if (idade < 2){
            this.peso += 0.5f; // aumenta 0,5kg se for filhote
        }
    }

    // engordar -> mudar peso da pessoa -> SET
    public void setEngordarPet(float kg){
       this.peso = this.peso + kg;
    }

    // emagrecer
    public void setEmagracerPet(float kg){
        if (kg > this.peso){
            System.out.println("Peso inválido, o pet nao pode ter peso negativo");
        } else {
            this.peso = this.peso - kg;
        }
    }

    // metodo exibir info
    public void exibirInfo(){
        System.out.println("---Informações do Pet---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especie: " + this.especie);
        System.out.println("Idade: " + this.idade + "anos");
        System.out.println("Peso: " + this.peso + "kg");
    }

}
