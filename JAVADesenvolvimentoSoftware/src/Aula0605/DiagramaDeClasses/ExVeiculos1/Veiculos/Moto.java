package Aula0605.DiagramaDeClasses.ExVeiculos1.Veiculos;

public class Moto extends Veiculo{
    private int cilindradas;
    private String tipoCombustivel;
    private String tipoFreio;

    public Moto(int ano, String modelo, String cor,  int cilindradas, String tipoCombustivel, String tipoFreio) {
        super(ano, modelo, cor);

        this.cilindradas = cilindradas;
        this.tipoCombustivel = tipoCombustivel;
        this.tipoFreio = tipoFreio;
    }

    @Override
    public void ligar() {}

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    public void ativarModoEsportivo() {
        System.out.println("Modo Esportivo ativado");
    }

    public void ligarPartidaEletrica() {
        System.out.println("Ligando partida elétrica");
    }
}
