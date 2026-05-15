package Aula1505.Controller;

import Aula1505.Model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoController {

    private static List<Aluno> listaAlunos = new ArrayList<>();

    public static void cadastrarAluno(String nome, String email, int matricula){
        Aluno novoAluno = new Aluno(nome, email, matricula);
        listaAlunos.add( novoAluno );
    }

    public static List<Aluno> getlistaDeAlunos(){
        return listaAlunos;
    }
}
