package Aula2703;

public class Doguinho {

    String nome;
    String raca;

    Pessoa dono;


    Doguinho(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }

    void adotado(Pessoa umaPessoa){
        this.dono = umaPessoa;
    }

    void mostrarInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Raca: " + this.raca);
        System.out.println("Dono: " + this.dono.getNome());
    }


}


/* O que esse codigo significa? Ele define uma classe chamada Doguinho,
que tem atributos para o nome, raça e dono do cachorro. O construtor da
classe recebe o nome e a raça como parâmetros para inicializar esses atributos.
O metodo adotado permite associar um objeto do tipo Pessoa como dono do cachorro.
O metodo mostrarInfo exibe as informações do cachorro, incluindo o nome, a raça e
o nome do dono. Essa classe pode ser usada para criar objetos de cachorros e associá-los
a pessoas que os adotaram. */