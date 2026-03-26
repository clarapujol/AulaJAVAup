package Exercicios;

import java.util.Scanner;

public class ConversaoTemperatura {

    public static String pegarInput (String texto){
        Scanner leitor = new Scanner(System.in);
        System.out.print(texto);

        return leitor.nextLine();
    }

    public static int pegarInputInt (String texto){
        return Integer.parseInt( pegarInput(texto) );
    }

    public static float pegarInputFloat (String texto){
        return Float.parseFloat( pegarInput(texto) );
    }

    public static void main(String[] args) {
        float tempCelsius = pegarInputFloat("Digite uma temperatura em Celsius: ");
        int conversao = pegarInputInt("Escolha a conversão:  1- Fahrenheit  2- Kelvin:");

        switch (conversao) {
            case 1:
                float tempFahrenheit = (tempCelsius * 9 / 5) + 32;
                System.out.println("A temperatura em Fahrenheit é: " + tempFahrenheit);
            case 2:
                float tempKelvin = (tempCelsius + 273);
                System.out.println("A temperatura em Kelvin é: " + tempKelvin);

        }
    }
}