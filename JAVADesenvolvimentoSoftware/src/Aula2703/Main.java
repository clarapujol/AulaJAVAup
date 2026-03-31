package Aula2703;


public class Main {

    public static void main(String[] args) {

        CadastroFuncionarios funcionarios = new CadastroFuncionarios();

        System.out.println("~~~~BEM VINDO~~~~~");

        System.out.println("CADASTRO DE FUNCIONARIOS");
        funcionarios.criarFuncionarios();

        System.out.println("--- AGORA MOSTRANDO ----");
        funcionarios.mostrarFuncionarios();

        System.out.println("FIM");


    }

}

/* O que esse codigo significa? Ele define a classe Main, que contém o metodo main, o
ponto de entrada do programa. Dentro do metodo main, um objeto do tipo CadastroFuncionarios
é criado. O programa exibe uma mensagem de boas-vindas e, em seguida, chama o metodo
criarFuncionarios para permitir que o usuário cadastre os funcionários. Depois disso, o programa
exibe uma mensagem indicando que as informações dos funcionários serão mostradas e chama o metodo
mostrarFuncionarios para exibir os detalhes de cada funcionário cadastrado. Por fim, o programa
exibe uma mensagem de fim. */