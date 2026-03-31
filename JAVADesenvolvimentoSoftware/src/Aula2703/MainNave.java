package Aula2703;

public class MainNave {

    public static void main(String[] args) {

        /*Nave n1 = new Nave("Abelhao");
        Nave n2 = new Nave("Zangao");
        Nave n3 = new Nave("Vezpao");
        Nave n4 = new Nave("Mosquitao");

        Frota f1 = new Frota();
        f1.verNaves();

        /*f1.adicionarNave(n1);
        f1.adicionarNave(n2);
        f1.adicionarNave(n3);
        f1.adicionarNave(n4);

        //f1.destruir();

        f1.verNaves();

        // System.out.println(n1.nome);
        // System.out.println(n2.nome);*/


        Frota f1 = new Frota();
        f1.verNaves();
        f1.criarNaves();
        f1.verNaves();

        deletarFrota(f1);




    }


}


/* O que esse codigo significa? Ele define a classe MainNave, que contém o metodo main, o
ponto de entrada do programa. Dentro do metodo main, um objeto do tipo Frota é criado. O
programa chama o metodo verNaves para exibir as naves presentes na frota (que inicialmente
estará vazia). Em seguida, o metodo criarNaves é chamado para criar e adicionar naves à frota.
Depois disso, o metodo verNaves é chamado novamente para exibir as naves recém-criadas na frota.
Por fim, a função deletarFrota é chamada para destruir a frota, limpando a lista de naves. */
