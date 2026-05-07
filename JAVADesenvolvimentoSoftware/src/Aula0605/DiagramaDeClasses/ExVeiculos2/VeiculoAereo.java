package Aula0605.DiagramaDeClasses.ExVeiculos2;

public class VeiculoAereo extends Veiculo {
    private int numeroMotores;


    public VeiculoAereo(int ano, String cor, String modelo, boolean ligado, int numeroMotores) {
        super(ano, cor, modelo, ligado);

        this.numeroMotores = numeroMotores;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }


    @Override
    public void ligar() {
        System.out.println("Ligando veiculo Aereo");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando veiculo Aereo");
    }
}
