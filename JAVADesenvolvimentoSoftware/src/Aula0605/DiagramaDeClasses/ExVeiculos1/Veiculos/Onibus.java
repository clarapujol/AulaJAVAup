package Aula0605.DiagramaDeClasses.ExVeiculos1.Veiculos;

public class Onibus extends Veiculo {

    private int capacidadePassageiros;
    private int portasAcesso;
    private int numeroPassageiros;

    public Onibus(int ano, String modelo, String cor, int capacidadePassageiros, int portasAcesso, int numeroPassageiros) {
        super(ano, modelo, cor);

        this.capacidadePassageiros = capacidadePassageiros;
        this.portasAcesso = portasAcesso;
        this.numeroPassageiros = numeroPassageiros;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Ônibus");
        this.ligado = true;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getPortasAcesso() {
        return portasAcesso;
    }

    public void setPortasAcesso(int portasAcesso) {
        this.portasAcesso = portasAcesso;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public void abrirPortaDianteira() {
        System.out.println("Abrindo Porta Dianteira");
    }

    public void anunciarParadaProxima() {
        System.out.println("PIIIIIIIIIIIIIII");
    }
}
