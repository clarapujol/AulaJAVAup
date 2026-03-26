import java.util.Scanner;

public class BonusSalarial {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu salário atual: ");
        float salario = Float.parseFloat(leitor.nextLine() );

        System.out.print("Digite o tempo de serviço (anos): ");
        int tempo = Integer.parseInt(leitor.nextLine() );

        float bonus = 0;
        float salarioFinal = 0;

        if (tempo < 1){
            System.out.println("Você não tem direito a bônus salarial.");

        }else if (tempo <= 3){
            bonus = salario * 0.05f;
        }else if(tempo <= 6){
            bonus = salario * 0.10f;
        }else {
            bonus = salario * 0.15f;
        }

        salarioFinal = salario + bonus;
        System.out.println("O valor do bônus é: " + bonus);
        System.out.println("Seu salário final com bônus é: " + salarioFinal);
    }
}