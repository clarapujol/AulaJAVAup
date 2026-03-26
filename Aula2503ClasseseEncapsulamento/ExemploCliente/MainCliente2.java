package Aula2503ClasseseEncapsulamento.ExemploCliente;

public class MainCliente2 {


    public static void main(String[] args){

        Cliente[] meusClientes = new Cliente[2];

        // FAZER CADASTRO
        for (int i = 0; i < meusClientes.length; i++) {

            String nome = InputHelper.lerTexto("Digite seu nome: "); // O "InputHelper.lerTexto()" é usado para ler uma linha de texto do usuário,
                                                                            // permitindo que ele insira o nome completo, incluindo espaços, sem problemas.
            String email = InputHelper.lerTexto("Digite seu email");
            int idade = InputHelper.lerNumero("Digite a idade: ");

            // ExemploCliente.Cliente novoCliente = new ExemploCliente.Cliente(nome, email, idade);
            // meusClientes[i] = novoCliente;

            meusClientes[i] = new Cliente(nome, email, idade);

        }


        // MOSTRAR CLIENTES
        for (int i = 0; i < meusClientes.length; i++) {

            if(meusClientes[i].idade >= 18){ // O "meusClientes[i].idade" é usado para acessar o atributo
                                            // "idade" do objeto "Cliente" armazenado na posição "i" do array "meusClientes".
                meusClientes[i].mostrarCadastro();
            }

        }



        // novoCliente.mostrarCadastroSeMaiorDeIdade();


    }

}

