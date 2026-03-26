package Aula1803;

import java.util.Scanner;

public class ExAula1803 {

    static Scanner leitor = new Scanner(System.in);

    public static String lerTexto(String textinho){
        System.out.print(textinho); // Exibe o texto para o usuário
        String resposta = leitor.nextLine(); // Lê a resposta do usuário
        return resposta; // Retorna a resposta lida
    }



    public static float lerNumero(String outroTexto){
        return Float.parseFloat(lerTexto(outroTexto)); // Converte a resposta para um número inteiro
    }

    public static float lerNota(String textinho){
        float nota = -1; // Variável para armazenar a nota lida, agora nota negativa

        do {
            nota = lerNumero(textinho); // Lê a nota do usuário
        }while (nota < 0.0f); // Continua solicitando a nota enquanto for negativa

        return nota; // Retorna a nota lida
    }


    public static void main(String[] args) {

        float media = 0;
        for (int i = 0; i <= 5; i++) { // Loop para ler os dados de 5 alunos
            System.out.println("\n--- Dados do Aluno " + (i + 1) + " ---"); // Exibe o número do aluno atual

            String nome = lerTexto("Digite o nome: "); // Lê o nome do aluno
            String matricula = lerTexto("Digite a matrícula: ");// Lê a matrícula do aluno

            float[] notas = new float[5]; // Cria um array para armazenar as notas
            float somaDasNotas = 0; // Variável para armazenar a soma das notas
            media = somaDasNotas / notas.length;

            System.out.println("Digite as notas: "); // Solicita ao usuário que digite as notas do aluno

            for (int j = 0; j < notas.length; j++) { // Loop para ler as notas do aluno
                notas[j] = lerNumero(">> Nota " + (j + 1) + ": "); // Lê as notas do usuário
                somaDasNotas += notas[j]; // Soma cada nota ao total
            }
        }


        // Cálculo da média das notas
//            float media = somaDasNotas / notas.length; // (nota1 + nota2) / 2; // Calcula a média das notas


        // Exibição dos resultados
//            System.out.println("================================");
//            System.out.println("Nome: " + nome); // Exibe o nome do aluno
//            System.out.println("Matrícula: " + matricula); // Exibe a matrícula do aluno
//            System.out.println("Media Final: " + media); // Exibe a nota final do aluno


        // Opcao 1
        if (media >= 6) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }


        // Opcao 2
        boolean aprovado = media > 6.0f; // Verifica se o aluno foi aprovado ou reprovado
//            System.out.print("Aprovado:" + (aprovado ? "(X)Sim ( )Não" : "( )Sim (X)Não")); // Exibe a opção de aprovação ou reprovação

    }
}
