package Aula2703;

public class CadastroFuncionarios {

    Funcionario[] funcionarios = new Funcionario[10];

    void criarFuncionarios(){
        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i] = new Funcionario();

            String nome = InputHelper.lerTexto("Digite o nome: ");
            funcionarios[i].setNome(nome);

            String cargo = InputHelper.lerTexto("Digite o cargo: ");
            funcionarios[i].setCargo(cargo);

            float salario = InputHelper.lerNumeroFloat("Digite o salario: ");
            funcionarios[i].setSalario(salario);
        }
    }

    void mostrarFuncionarios(){
        for (int i = 0; i < funcionarios.length; i++) {
            // funcionarios[0].mostrarInfo();
            System.out.println("-----");
            System.out.println("Nome: " + funcionarios[i].getNome());
            System.out.println("Cargo: " + funcionarios[i].getCargo());
            System.out.println("Salario: " + funcionarios[i].getSalario());
        }
    }

    /*
    public static void main(String[] args) {

        // [null, null]

        /*funcionarios[0] = new Funcionario();
        funcionarios[0].setNome("Carlos"); // set é para atribuir um valor a um atributo privado
        funcionarios[0].setCargo("Pedreiro");
        funcionarios[0].setSalario(5000.0f);

        funcionarios[0].mostrarInfo();* /

    } */


/* O que esse codigo significa? Ele define uma classe chamada CadastroFuncionarios, que possui um
array de objetos do tipo Funcionario. A classe tem dois métodos principais: criarFuncionarios e
mostrarFuncionarios. O metodo criarFuncionarios é responsável por preencher o array de funcionários,
solicitando ao usuário que insira o nome, cargo e salário de cada funcionário. O metodo
mostrarFuncionarios exibe as informações de cada funcionário armazenado no array. O código também
inclui um comentário com um exemplo de como criar um funcionário e mostrar suas informações usando
 os métodos da classe Funcionario. */

}

