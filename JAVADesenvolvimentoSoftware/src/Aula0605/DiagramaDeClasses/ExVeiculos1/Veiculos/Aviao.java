package Aula0605.DiagramaDeClasses.ExVeiculos1.Veiculos;


import Aula0605.DiagramaDeClasses.ExVeiculos2.VeiculoAereo;

public class Aviao extends VeiculoAereo {
    private float envergaduraAsa;
    private String tipoCombustivel;

    public Aviao(int ano, String cor, String modelo, boolean ligado) {
        super(ano, cor, modelo, ligado);

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
