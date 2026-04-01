package Exercicios;

/*
 Contagem de Números Pares e Ímpares
  -> Criar um programa que recebe um array de números inteiros e
     conta quantos números são pares e quantos são ímpares.
 */

import java.util.Scanner;

public class ParImpar {
    Scanner leitor = new Scanner(System.in);
    public static void main(String[] args){
        int[] numeros = {5, 8, 12, 17, 21, 30, 42};


        int numPares = 0;
        int numImpares = 0;

        for (/*int i = 0; i < numeros.length; i++*/ int numero : numeros){ // for melhorado, ou seja, para cada número dentro do array numeros, faça...
            if (numero  % 2 == 0){ // == -> comparação de valor
                numPares++; // ++ -> incremento, ou seja, numPares = numPares + 1
            } else{
                numImpares++; // ++ -> incremento, ou seja, numImpares = numImpares + 1
            }

        }
        System.out.println("Quantidade de números pares: " + numPares);
        System.out.println("Quantidade de números ímpares: " + numImpares);
    }



}
