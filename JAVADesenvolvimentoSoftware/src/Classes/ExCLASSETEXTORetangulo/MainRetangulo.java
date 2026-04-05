package Classes.ExCLASSETEXTORetangulo;
import java.util.Scanner;

public class MainRetangulo {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a base: ");
        float base = leitor.nextFloat();

        System.out.print("Digite a altura: ");
        float altura = leitor.nextFloat();

        // criar objeto com as medidas
        Retangulo ret = new Retangulo (base, altura);
        // instanciando a classe Retangulo, criando um objeto r do tipo Retangulo, com
        // os valores de base e altura informados pelo usuário

        // calcular a quantiade de pisos e rodapés necessárias para o local
        System.out.print("\nQuantidade de pisos necessários: " + ret.calcularArea());

        System.out.print("\nQuantidade de rodapés necessários: " + ret.calcularPerimetro());

        leitor.close();


    }
}
