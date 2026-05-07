package Aula0605.DiagramaDeClasses.ExVeiculos2;

public class Aviao extends Veiculo{

    private float envergaduraAsa;
    private String tipoCombustivel;

    public Aviao(int ano, String cor, String modelo, boolean ligado, float envergaduraAsa, String tipoCombustivel) {
        super(ano, cor, modelo, ligado);

        this.envergaduraAsa = envergaduraAsa;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Aviao");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Aviao");
    }

    public void decolar(){
        System.out.println("Aviao decolando");
    }

    public void pousar(){
        System.out.println("Aviao pousando");
    }
}
