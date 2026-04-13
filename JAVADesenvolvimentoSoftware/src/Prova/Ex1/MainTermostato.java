package Prova.Ex1;
import java.util.Scanner;

public class MainTermostato {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Temperatura inicial desejada: ");
        int temp = scan.nextInt();
        Termostato meuar = new Termostato(26);


        int opcao = 0;
        while (opcao != 4){
            System.out.println("---Menu---");
            System.out.println("1- Aumentar Temperatura");
            System.out.println("2- Diminuir Temperatura");
            System.out.println("3- Exibir Status");
            System.out.println("4- Sair ");
            System.out.println(" > Escolha: ");
            opcao = scan.nextInt();

            if(opcao == 1) meuar.aumentarTemp();
            else if(opcao == 2) meuar.diminuirTemp();
            else if(opcao == 3) meuar .exibirStatus();
        }
    }
}

