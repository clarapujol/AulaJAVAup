package Aula0605.DiagramaDeClasses.ExVeiculos2;

public class VeiculoTerrestre extends Veiculo{

    private int numeroRodas;

    public VeiculoTerrestre(int ano, String cor, String modelo, boolean ligado, int numeroRodas) {
        super(ano, cor, modelo, ligado);

        this.numeroRodas = numeroRodas;
    }


    @Override
    public void ligar() {
        System.out.println("Ligando veiculo Terrestre");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando veiculo Terrestre");
    }
}
