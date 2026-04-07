package DesafiosOrientacaoaObjetos.ExCalculadora;
import java.util.Scanner;


public class MainCalculadora {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 4){
            System.out.println("----Bem vindo a Calculadora dusCria----");
            System.out.println("Selecione a operação que deseja realizar: ");
            System.out.println("1- Adicao ");
            System.out.println("2- Subtracao ");
            System.out.println("3- Multiplicacao ");
            System.out.println("4- Divisao ");
            System.out.print("Escolha:");
            opcao = leitor.nextInt();

            if (opcao != 5){
                System.out.println("Digite um numero");
                double num1 = leitor.nextDouble();

                System.out.println("Digite outro numero");
                double num2 = leitor.nextDouble();

                switch (opcao){
                    case 1:
                        System.out.print("Calculando... " + Calculadora.somar(num1, num2));
                        break;

                    case 2:
                        System.out.println("Calculando... " + Calculadora.subtrair(num1, num2));
                        break;

                    case 3:
                        System.out.println("Calculando... " + Calculadora.multiplicar(num1, num2));
                        break;

                    case 4:
                        System.out.println("Calculando... " + Calculadora.dividir(num1, num2));
                        break;

                    default:
                        System.out.println("Numero inválido! Tente novamente.");
                }
            }
        }
        System.out.println("Encerrando...");
        leitor.close();
    }
}



