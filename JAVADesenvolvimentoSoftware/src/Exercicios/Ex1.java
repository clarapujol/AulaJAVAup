package Exercicios;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = leitor.nextInt();

        int ant = num1 - 1;
        int suc = num1 + 1;

        System.out.println("Seu antecessor é: " + ant);
        System.out.println("Seu sucecessor é: " + suc);
    }
}
