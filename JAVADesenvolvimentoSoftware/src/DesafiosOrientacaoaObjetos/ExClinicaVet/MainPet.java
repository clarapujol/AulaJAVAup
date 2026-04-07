package DesafiosOrientacaoaObjetos.ExClinicaVet;
import java.util.Scanner;

public class MainPet {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        // array que guarda até 20 pets
        // começa vazio, total controla quantos foram cadastrados
        Pet[] pets = new Pet[50];
        int total = 0;

        int opcao = 0;

        // loop principal: fica repetindo até o usuário escolher sair (5)
        while (opcao != 5){
            System.out.println("\n=== Clínica Veterinária ===");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Listar todos os pets");
            System.out.println("3 - Buscar pet por nome");
            System.out.println("4 - Operações no pet");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao){
                case 1: // CADASTRAR PET
                    System.out.println("\n=== Cadastrar Pet ===");
                    System.out.println("Nome: ");
                    String nome = leitor.nextLine();

                    System.out.println("Especie: ");
                    String especie = leitor.nextLine();

                    System.out.println("Idade: ");
                    int idade = leitor.nextInt();

                    System.out.println("Peso: ");
                    float peso = leitor.nextFloat();
                    leitor.nextLine();


                    // cria novo objeto Pet e salva no array
                    pets[total] = new Pet(nome, especie, idade, peso);
                    total++; // incrementa o contador
                    System.out.println("Pet cadastrado com sucesso!");
                    break;

                case 2: // LISTAR TODOS
                    if (total == 0) {
                        System.out.println("Nenhum pet cadastrado!");
                    } else {
                        // percorre o array e exibe cada pet
                        for (int i = 0; i < total; i++) {
                            System.out.println("\n--- Pet " + (i + 1) + " ---");
                            pets[i].exibirInfo();
                        }
                    }
                    break;

                case 3: // BUSCAR POR NOME
                    System.out.print("Digite o nome para buscar: ");
                    String busca = leitor.nextLine();
                    boolean achou = false; // começa como false

                    for (int i = 0; i < total; i++) {
                        // equalsIgnoreCase = compara ignorando maiúsculas/minúsculas
                        if (pets[i].getNome().equalsIgnoreCase(busca)) {
                            pets[i].exibirInfo();
                            achou = true; // encontrou!
                        }
                    }

                    // ! = NÃO: se não achou, exibe mensagem
                    if (!achou) {
                        System.out.println("Pet não encontrado!");
                    }
                    break;

                case 4: // OPERAÇÕES NO PET
                    System.out.print("Digite o nome do pet: ");
                    String nomePet = leitor.nextLine();

                    for (int i = 0; i < total; i++) {
                        if (pets[i].getNome().equalsIgnoreCase(nomePet)) {

                            System.out.println("1 - Aniversário");
                            System.out.println("2 - Engordar");
                            System.out.println("3 - Emagrecer");
                            System.out.print("Escolha: ");
                            int sub = leitor.nextInt();

                            if (sub == 1) {
                                pets[i].envelhecerPet();
                                System.out.println("Feliz aniversário " + pets[i].getNome() + "!");
                                System.out.println("Nova idade: " + pets[i].getIdade());
                                System.out.println("Novo peso: " + pets[i].getPeso() + "kg");

                            } else if (sub == 2) {
                                System.out.print("Quantos kg engordar? ");
                                float kg = leitor.nextFloat();
                                pets[i].setEngordarPet(kg);
                                System.out.println("Novo peso: " + pets[i].getPeso() + "kg");

                            } else if (sub == 3) {
                                System.out.print("Quantos kg emagrecer? ");
                                float kg = leitor.nextFloat();
                                pets[i].setEmagracerPet(kg);
                                System.out.println("Novo peso: " + pets[i].getPeso() + "kg");
                            }
                            leitor.nextLine(); // limpa buffer
                        }
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o sistema... Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida!");

            }
        }

        leitor.close();
    }
}
