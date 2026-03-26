package Aula2503ClasseseEncapsulamento;

public class MainAluno {

    public static void main(String[] args){

        Aluno novoAluno = new Aluno();

        // novoAluno.nome = "Tadeu";
        // System.out.println("Nome: " + novoAluno.nome);

        novoAluno.matricula = "";

        novoAluno.setNome("Tadeu");
        System.out.println("Nome: " + novoAluno.getNome());

    }


}
