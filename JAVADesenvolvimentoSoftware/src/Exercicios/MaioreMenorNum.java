package Exercicios;

/*
    Encontrar o Maior e o Menor Número
     -> Criar um programa que recebe um array de números inteiros
        e encontra o maior e o menor número dentro do array
 */

public class MaioreMenorNum {

    public static void main(String[] args){
        int[] num = {45, 12, 78, 4, 90, 23};

        int maior = num[0];
        int menor = num[0];

        for (int i = 1; i < num.length; i++){
            if (num[i] > maior){
                maior = num[i];
            }

            if (num[i] < menor) {
                menor = num[i];
            }
        }


        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }



}