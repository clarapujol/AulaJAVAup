package Aula2703;

public class MainPetShop {

    public static void main(String[] args) {

        Pessoa serHumano = new Pessoa("Maria", "+5511");

        Doguinho dog = new Doguinho("Rex", "Vira-Lata");


        dog.adotado(serHumano);

        serHumano.setNome("Maria Fernanda");
        dog.mostrarInfo();

        //System.out.println(serHumano);
        //System.out.println(dog);


    }

}

/* O que esse codigo significa? Ele define a classe MainPetShop, que contém o metodo main, o
ponto de entrada do programa. Dentro do metodo main, um objeto do tipo Pessoa é criado com o
nome "Maria" e um número de telefone. Em seguida, um objeto do tipo Doguinho é criado com o nome
"Rex" e a raça "Vira-Lata". O metodo adotado é chamado para associar o objeto Pessoa como dono do
Doguinho. O nome da pessoa é atualizado para "Maria Fernanda" usando o metodo setNome. Por fim, o
metodo mostrarInfo é chamado para exibir as informações do Doguinho, incluindo o nome, a raça e o
nome do dono. O código também inclui comentários que mostram como imprimir os objetos Pessoa e
Doguinho diretamente, o que resultaria na exibição de suas representações em string. */