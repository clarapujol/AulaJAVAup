package Exercicios;

import java.util.Scanner;

public class Exif {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt();

        if (idade >= 18){
            System.out.print("Você é maior de idade!");
        }else{
            System.out.print("Você é menor de idade!");
        }
    }
}
