package Aula1504.Recap;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private int idade;
    private String nome;
    // private Endereco minhaCasa;
    private List<Endereco> minhasCasas = new ArrayList<>();

    Pessoa(String nome) {
        this.nome = nome;
    }

    Pessoa(String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }

    // addEndereco
    void construirCasa(String c, String b, String r, String n){
        // minhaCasa = new Endereco(r, n, b, c);
        minhasCasas.add( new Endereco(r, n, b, c) );
    }

    void mostrarEndereco(){
        System.out.println("Nome: " + this.nome);

        for (int i = 0; i < minhasCasas.size(); i++) {
            // Endereco casa = minhasCasas.get(i);
            System.out.println("Cidade: " + minhasCasas.get(i).getCidade());
            System.out.println("Bairro: " + minhasCasas.get(i).getBairro());
            System.out.println("Rua: " + minhasCasas.get(i).getRua());
            System.out.println("Numero: " + minhasCasas.get(i).getNumero());
        }

        /*for (Endereco casa : minhasCasas) {
            System.out.println("Cidade: " + casa.getCidade());
            System.out.println("Bairro: " + casa.getBairro());
            System.out.println("Rua: " + casa.getRua());
            System.out.println("Numero: " + casa.getNumero());
        }*/

    }



    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}

