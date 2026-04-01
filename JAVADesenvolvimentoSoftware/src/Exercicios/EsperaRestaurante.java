package Exercicios;

import java.util.Scanner;

/*
O restaurante aceita reservas para um máximo de 5 pessoas por
vez. O sistema deve perguntar quantas pessoas querem reservar.
Se o número for maior que 5, ele deve recusar e pedir novamente.
Dica: Use um while para garantir que o número de reservas seja
válido.

|| -> operador lógico "OU", ou seja, se uma das condições for verdadeira,
o resultado é verdadeiro
 */

public class EsperaRestaurante {

    public static void man (String[] args){
        Scanner leitor = new Scanner(System.in);

        int maxPessoas = 5;
        int numPessoas = 0;

        while (numPessoas <= 0 || numPessoas > maxPessoas){ // o while garante que o programa continue perguntando até que o número de pessoas seja válido, ou seja, maior que 0 e menor ou igual a 5
            System.out.print("Quantas pessoas querem reservar? ");
            numPessoas = leitor.nextInt();

            if (numPessoas <= 0 || numPessoas > maxPessoas){ // o if verifica se o número de pessoas é inválido, ou seja, menor ou igual a 0 ou maior que o máximo permitido
                System.out.println("Número inválido. O restaurante aceita reservas para um máximo de " + maxPessoas + " pessoas por vez. Por favor, tente novamente.");
                // o programa volta para o início do while, ou seja, pergunta novamente quantas pessoas querem reservar
            }else{
                System.out.println("Reserva confirmada para " + numPessoas + " pessoas. Obrigado!");
            }
        }
        leitor.close();
    }

}
