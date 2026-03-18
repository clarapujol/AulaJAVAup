import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = leitor.nextLine();

        System.out.print("Ano: ");
        //int ano = leitor.nextInt();
        //leitor.nextLine();

        int ano = Integer.parseInt( leitor.nextLine() ); //SÓ QUANDO MUDA DE STRING PRA NÚMERO

        // Integer.parseInt(...)
        // Integer.valueOf(...)

        // Double.parseDouble(...)
        // Double.valueOf(...)

        // Float.parse Float(...)
        // Float.valueOf(...)

        System.out.print("Mes: ");
        String mes = leitor.nextLine();

        int idade = 2026 - ano;

        System.out.println("Bem vinda " + nome);
        System.out.println("Idade: " + idade);
    }
}