package Aula0605.DiagramaDeClasses.ExVeiculos1.Veiculos;

public class Carro extends Veiculo {

    private int numeroPortas;
    private String tipoTransmissao;
    private float capacidadePortaMalas;

    public Carro(int ano, String modelo, String cor, int numeroPortas, String tipoTransmissao, float capacidadeMalas) {
        this.numeroPortas = numeroPortas;
        this.tipoTransmissao = tipoTransmissao;
        this.capacidadePortaMalas = capacidadeMalas;
        super(ano, modelo, cor);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Veiculos.Carro");
        this.ligado = true;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getTipoTransmissao() {
        return tipoTransmissao;
    }

    public void setTipoTransmissao(String tipoTransmissao) {
        this.tipoTransmissao = tipoTransmissao;
    }

    public float getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(float capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    public void ligarFarol() {
        System.out.println("Ligando farol");
    }

    public void abrirTeto() {
        System.out.println("Abrindo teto");
    }
}
