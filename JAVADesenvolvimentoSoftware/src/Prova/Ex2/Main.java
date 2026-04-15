package Prova.Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Servico corte = new Servico("Corte", 35.0f);
        Servico barba = new Servico("Barba", 25.0f);
        Servico completo = new Servico("Completo", 50.0f);

        List<Atendimento> meusAtendimentos = new ArrayList<>();
        int opMenu = 0;

        while(opMenu != 3) {

            System.out.println("----BEM VINDO AO MENU ------");
            System.out.println("1. Novo Atendimento");
            System.out.println("2. Relatorio");
            System.out.println("3. Sair");
            System.out.println("-------");
            opMenu = Integer.parseInt(scan.nextLine());

            switch (opMenu) {
                case 1:
                    // --- INICIO ATENDIMENTO ----------------------------------------------
                    System.out.println("--- Novo Atendimento ---");

                    System.out.print("Nome do Cliente: ");
                    String nome = scan.nextLine();

                    Atendimento novoAtendimento = new Atendimento(nome);
                    int op = 0;
                    while (op != 4) {
                        System.out.println("> Adicionar Serviço: ");
                        System.out.println("1. Corte(35) 2. Barba (25) 3. Completo(50) 4. Sair");
                        op = Integer.parseInt(scan.nextLine());

                        if (op == 1) novoAtendimento.addServico(corte);
                        else if (op == 2) novoAtendimento.addServico(barba);
                        else if (op == 3) novoAtendimento.addServico(completo);
                    }
                    meusAtendimentos.add(novoAtendimento);
                    // ---- FIM ATENDIMENTO -----
                    break;
                case 2:
                    // --- INICIO RESUMO ----------------------------------------------
                    float somaDasSomas = 0;

                    System.out.println("Resumo Atendimentos");
                    for (Atendimento atend : meusAtendimentos) {

                        System.out.print("> Cliente: " + atend.getNomeCliente());
                        System.out.println(" | Valor: " + atend.calcularTotal());
                        somaDasSomas += atend.calcularTotal();

                    }
                    System.out.println("Faturamento do dia: " + somaDasSomas);
                    // --- FIM RESUMO ----------------------------------------------
                    break;
            }
        }

    }

}

