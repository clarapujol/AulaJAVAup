package Aula2404.Empresa;

public class Gerente extends Funcionarios {

    public Gerente(String nome){
        super(nome); // super é usado para chamar o construtor da classe (Funcionarios)
        // e passar o nome do gerente para ele.
    }

    void curtirFerias(){
        System.out.println("Bem-vindo à Los Angeles! Seu sonho se realizou!");
    }
}
