package Aula0605.DiagramaDeClasses.ExVeiculos2;

public class VeiculoAquatico extends Veiculo {

    private float comprimento;

    public VeiculoAquatico(int ano, String cor, String modelo, boolean ligado, float comprimento) {
        super(ano, cor, modelo, ligado);

        this.comprimento = comprimento;
    }


    @Override
    public void ligar() {
        System.out.println("Ligando veículo Aquatico");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando veículo Aquatico");
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
}
