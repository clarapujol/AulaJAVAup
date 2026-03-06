import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma temperatura em Celsius: ");
        float tempCelsius = leitor.nextFloat();

        System.out.println("Escolha a conversão:");
        System.out.println("1- Fahrenheit");
        System.out.println("2- Kelvin");

        int conversao = leitor.nextInt();

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