package Aula1505.View;

import Aula1505.Controller.AlunoController;
import Aula1505.Model.Aluno;

import java.util.List;

public class AlunoView {

    public static void criarAluno(){

        System.out.println();
        System.out.println("-----------------------");
        System.out.println("-- Cadastro de Aluno-- ");

        String nome = InputHelper.lerTexto(" > Nome: ");
        String email = InputHelper.lerTexto(" > Email: ");
        int matricula = InputHelper.lerNumero(" > Matrícula: ");

        // ??????? salvar a info em algum lugar
        AlunoController.cadastrarAluno(nome, email, matricula);

        System.out.println("-----------------------");

        // listar os alunos que existem
    }

    public static void listarAlunos(){
        System.out.println();
        System.out.println("------------------------");
        System.out.println("---- Lista de Aluno---- ");

        // ???? procurar lista
        List<Aluno> alunos = AlunoController.getlistaDeAlunos();
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(" > " + alunos.get(i).getNome() );
        }

        System.out.println("------------------------");
    }
}
