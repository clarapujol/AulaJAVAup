package Classes.ExCLASSETEXTOPessoa;
import java.util.Scanner;

public class MainPessoa {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        Pessoa p = new Pessoa("Clara", 15, 60.0f, 1.60f);

        // pedir nome
        System.out.print("Digite o nome: " + p.getNome());

        // pedir idade
        System.out.print("\nDigite a idade: " + p.getIdade() + " anos");

        // pedir peso
        System.out.print("\nDigite o peso: " + p.getPeso() + "kg");

        // pedir altura
        System.out.print("\nDigite a altura: " + p.getAltura() + "cm");

        // envelhecer
        System.out.print("\n---Envelhecendo a pessoa... (2anos)---");
        p.envelhecer();
        p.envelhecer();
        System.out.print("\nIdade: " + p.getIdade());
        System.out.print("\nAltura: " + p.getAltura() + "cm");

        // engordar
        System.out.print("\n---Engordando a pessoa... (5kg)---");
        p.setEngordar(5);
        System.out.print("\nPeso: " + p.getPeso() + "kg");

        // emagrecer
        System.out.print("\n---Emagrecendo a pessoa... (3kg)---");
        p.setEmagrecer(3);
        System.out.print("\nPeso: " + p.getPeso() + "kg");

        // crescer
        System.out.println("\n--- Após crescer 2cm ---");
        p.setCrescer(2f);
        System.out.println("Altura: " + p.getAltura() + " cm");

        leitor.close();


    }


}
