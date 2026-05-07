package Aula0605.DiagramaDeClasses.ExVeiculos1.Veiculos;

public class Aviao extends VeiculoAereo {
    private float envergaduraAsa;
    private String tipoCombustivel;

    public Aviao(int ano, String modelo, String cor, int numeroMotores, float envergaduraAsa, String tipoCombustivel) {
        super(ano, modelo, cor, numeroMotores);
        this.envergaduraAsa = envergaduraAsa;
        this.tipoCombustivel = tipoCombustivel;
    }

    public float getEnvergaduraAsa() {
        return envergaduraAsa;
    }

    public void setEnvergaduraAsa(float envergaduraAsa) {
        this.envergaduraAsa = envergaduraAsa;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
