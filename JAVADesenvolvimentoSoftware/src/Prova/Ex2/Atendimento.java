package Prova.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Atendimento {

    private String nomeCliente;
    private List<Servico> servicosCliente = new ArrayList<>();

    Atendimento(String nome){
        this.nomeCliente = nome;
    }

    void addServico(Servico umServico){
        servicosCliente.add(umServico);
    }

    float calcularTotal(){
        float somaTotal = 0;

        /* for (int i = 0; i < servicosCliente.size(); i++) {
                somaTotal += servicosCliente.get(i).getPreco();
           } */

        for (Servico servico : servicosCliente) {
            somaTotal += servico.getPreco();
        }

        return somaTotal;
    }

    void exibirResumo(){
        System.out.println("--- Resumo Cliente --- ");
        System.out.println("NomeCliente:" + this.nomeCliente);

        for (Servico servico : servicosCliente) {
            System.out.println(" > " + servico.getNome() + " (" + servico.getPreco() + ")");
        }

        System.out.println("Total: R$" + calcularTotal());
        System.out.println("--------");
    }


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

}

