package Exercicios;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = leitor.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = leitor.nextInt();

        int menos = num1 - num2;

        System.out.println("O resultado da Subtração é: " + menos);

    }
}
