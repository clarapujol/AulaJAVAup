package Aula1505.View;

public class Sistema {

    public static void executar(){
        int op;
        do {
            mostrarMenu();
            op = InputHelper.lerNumero(" > Escolha a opção desejada: ");
            verificarOpcao(op);
        }while (op != 0);

        //faço o que ele escolheu
    }

    private static void verificarOpcao(int op) {

        switch (op){
            case 1:
                // chamar função CriarAluno do AlunoView
                AlunoView.criarAluno();
                break;

            case 2:
                AlunoView.listarAlunos();
                break;
        }
    }

    public static void mostrarMenu(){
        System.out.println("============================");
        System.out.println("-- Bem vindo na escolinha --");
        System.out.println(" > 1. Criar Aluno");
        System.out.println(" > 2. Listar Alunos");
        System.out.println(" > 0. Sair");
        System.out.println("===========================");
    }
}
