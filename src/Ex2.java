import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = leitor.nextInt();

        System.out.print("Digite outro numero: ");
        int num2 = leitor.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma é: " + soma);
    }
}