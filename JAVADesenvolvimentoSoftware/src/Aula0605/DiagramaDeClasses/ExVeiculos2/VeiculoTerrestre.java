package Aula0605.DiagramaDeClasses.ExVeiculos2;

public class VeiculoTerrestre extends Veiculo{

    private int numeroRodas;

    public VeiculoTerrestre(int ano, String cor, String modelo, boolean ligado, int numeroRodas) {
        super(ano, cor, modelo, ligado);

        this.numeroRodas = numeroRodas;
    }


    @Override  // não é obrigado a colocar isso quando tem o abstract
    public void ligar() { // não é obrigado a colocar isso quando tem o abstract
        System.out.println("Ligando veiculo Terrestre"); // não é obrigado a colocar isso quando tem o abstract
    }

    @Override // não é obrigado a colocar isso quando tem o abstract
    public void desligar() { // não é obrigado a colocar isso quando tem o abstract
        System.out.println("Desligando veiculo Terrestre"); // não é obrigado a colocar isso quando tem o abstract
    }
}

