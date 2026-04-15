package Prova.Ex1;
import java.util.Scanner;

public class MainTermostato {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Temp Inicial Desejada: ");
        int temp = scan.nextInt();
        Termostato meuar = new Termostato(temp);

        int op = 0;
        while(op != 4){
            System.out.println("--- Menu");
            System.out.println("1. Aumentar Temperatura.");
            System.out.println("2. Diminuir Temperatura.");
            System.out.println("3. Exibir Status.");
            System.out.println("4. Sair.");

            System.out.print("> Escolha: ");
            op = scan.nextInt();

            if(op == 1) meuar.aumentarTemp();
            else if (op == 2) meuar.diminuirTemp();
            else if (op == 3) meuar.exibirStatus();

        }

    }
}

