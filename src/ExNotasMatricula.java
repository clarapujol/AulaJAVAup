import java.util.Arrays;
import java.util.Scanner;

public class ExNotasMatricula {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);

        // Entrada dos dados do aluno
        System.out.print("Digite a matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 = scanner.nextFloat();

        // Cálculo da nota final
        float notaFinal = (nota1 + nota2) / 2;
        boolean aprovado = notaFinal >= 6.0;

        // Exibição dos resultados
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Aprovado: " + (aprovado ? "(X) Sim ( ) Não" : "( ) Sim (X) Não"));
        System.out.printf("Nota Final: %.2f%n", notaFinal); // Exibe a nota com 2 casas decimais

        scanner.close();
    }




}