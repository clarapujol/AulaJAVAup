package DesafiosOrientacaoaObjetos.ExCalculadora;
import java.util.Scanner;


public class MainCalculadora {
     // leitor esta declarando os valores que quer

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int opcao = 0;

        // loop que fica repetindo até o usuário escolher sair (opcao 5)
        while (opcao != 5) {
            System.out.println("\n=== Calculadora ===");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            if (opcao != 5) {
                // pede os dois números apenas se o usuário não escolheu sair
                System.out.print("Digite o primeiro número: ");
                double a = leitor.nextDouble();
                System.out.print("Digite o segundo número: ");
                double b = leitor.nextDouble();

                // switch verifica qual operação o usuário escolheu
                switch (opcao) {
                    case 1:
                        // chama o método estático direto pela classe, sem criar objeto
                        System.out.println("Resultado: " + Calculadora.somar(a, b));
                        break;
                    case 2:
                        System.out.println("Resultado: " + Calculadora.subtrarir(a, b));
                        break;
                    case 3:
                        System.out.println("Resultado: " + Calculadora.multiplicar(a, b));
                        break;
                    case 4:
                        System.out.println("Resultado: " + Calculadora.dividir(a, b));
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }
        }
        System.out.println("Encerrando a calculadora...");
        leitor.close();
    }
}



