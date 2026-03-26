package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExemploArray {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[2];

        System.out.println("Digite 5 números");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = Integer.parseInt( leitor.nextLine() );
        }

        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        float media = (float) soma / numeros.length;


        System.out.println(Arrays.toString(numeros)); // Imprime o array completo
        System.out.println("A soma é: "+ soma);
        System.out.println("A média é: " + media);

    }
}
