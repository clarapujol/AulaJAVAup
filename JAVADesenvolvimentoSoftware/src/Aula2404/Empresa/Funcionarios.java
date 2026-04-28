package Aula2404.Empresa;

public class Funcionarios {
    String nome;

    public Funcionarios(String nome){
        this.nome = nome;
    }

    void baterPonto(){
        System.out.println(nome + "bateu ponto!!");
    }
}
