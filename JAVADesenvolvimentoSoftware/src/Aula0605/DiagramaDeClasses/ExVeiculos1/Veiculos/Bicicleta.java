package Aula0605.DiagramaDeClasses.ExVeiculos1.Veiculos;

public class Bicicleta extends Veiculo{
    private int numeroMarchas;
    private String tipoFreio;
    private String estiloQuadro;

    public Bicicleta(int ano, String modelo, String cor, int numeroMarchas, String tipoFreio, String estiloQuadro) {
        this.numeroMarchas = numeroMarchas;
        this.tipoFreio = tipoFreio;
        this.estiloQuadro = estiloQuadro;
        super(ano, modelo, cor);
    }

    @Override
    public void ligar() {}

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    public String getEstiloQuadro() {
        return estiloQuadro;
    }

    public void setEstiloQuadro(String estiloQuadro) {
        this.estiloQuadro = estiloQuadro;
    }

    public void pedalar() {
        System.out.println("Pedalando");
    }

    public void parar() {
        System.out.println("Parando");
    }
}
