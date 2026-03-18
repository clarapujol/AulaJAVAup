import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = leitor.nextInt();

        int duble = num1 * 2;

        System.out.println("O dobro é: " + duble);
    }
}