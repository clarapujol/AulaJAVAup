package Aula2703;

public class Funcionario {

    private String nome; // null
    private String cargo; // null ou ""
    private float salario; // null ou 0

    void setNome(String novoNome){
        this.nome = novoNome;
    }

    String getNome(){
        return this.nome;
    }

    void setCargo(String novoCargo){
        this.cargo = novoCargo;
    }

    String getCargo(){
        return this.cargo;
    }

    void setSalario(float novoSalario){
        this.salario = novoSalario;
    }

    float getSalario(){
        return this.salario;
    }

    void mostrarInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Cargo: " + this.cargo);
    }


}


/* Em resumo esse arquivo mostra o conceito de encapsulamento,
onde os atributos de uma classe são privados e só podem ser acessados
ou modificados através de métodos públicos (getters e setters). Isso
ajuda a proteger os dados e a controlar como eles são acessados ou alterados,
garantindo a integridade dos objetos e promovendo uma melhor organização do código. */


