package Classes.ExCLASSETEXTOTv;
import java.util.Scanner;

public class MainTv {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        Tv televisao = new Tv(1, 50);

        System.out.println("=== Bem vindo à TV! ===");
        System.out.println("Canal inicial: " + televisao.getCanal());
        System.out.println("Volume inicial: " + televisao.getVolume());

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Mudar canal");
            System.out.println("2 - Aumentar volume");
            System.out.println("3 - Diminuir volume");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o canal (1 a 50): ");
                    int novoCanal = leitor.nextInt();
                    televisao.setmudarCanal(novoCanal);
                    System.out.println("Canal atual: " + televisao.getCanal());
                    break;

                case 2:
                    televisao.setmudarVolume(televisao.getVolume() + 1);
                    System.out.println("Volume atual: " + televisao.getVolume());
                    break;

                case 3:
                    televisao.setmudarVolume(televisao.getVolume() - 1);
                    System.out.println("Volume atual: " + televisao.getVolume());
                    break;

                case 4:
                    System.out.println("Desligando a TV... Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        leitor.close();
    }
}
