package Aula2503ClasseseEncapsulamento;

public class Aluno {
    protected String matricula;
    private String nome;

    int nota1;
    int nota2;

    public void setNome(String novoNome){
        this.nome = novoNome; // this.nome se refere ao atributo nome da classe Aluno, e novoNome é o valor que está sendo
                             // passado para o metodo setNome. O uso de "this" é necessário para diferenciar entre o atributo
                            // da classe e o parâmetro do metodo, ambos com o mesmo nome "nome".
    }

    public String getNome(){
        return this.nome;
    }


}
