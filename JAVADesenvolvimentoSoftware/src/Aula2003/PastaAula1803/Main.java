package Aula2003.PastaAula1803;

import java.util.Scanner;

public class Main {

    static Scanner leitor = new Scanner(System.in);


    public static String lerTexto(String textinho){
        System.out.print(textinho);
        String resposta = leitor.nextLine();
        return resposta;
    }

    public static float lerNumero(String outroTexto){
        return Float.parseFloat(lerTexto(outroTexto));
    }


    public static void main(String[] args) {

        String nome = lerTexto("Digite seu nome: ");
        String matriula = lerTexto("Digite a matricula: ");

        float nota1 = lerNumero("Digite a Nota 1: ");
        float nota2 = lerNumero("Digite a Nota 2: ");

        float media = (nota1 + nota2) / 2;

        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matriula);
        System.out.println("Nota Final: " + media);

        // Op 1
        if(media >= 6.0f){
            System.out.println("Aprovado: (X)Sim ()Nao");
        }else{
            System.out.println("Aprovado: ()Sim (X)Nao");
        }

        // Op 2
        boolean aprovado = media >= 6.0f;
        System.out.println("Aprovado: " + (aprovado ? "(X)Sim ()Nao" : " ()Sim (X)Nao") );


    }

}