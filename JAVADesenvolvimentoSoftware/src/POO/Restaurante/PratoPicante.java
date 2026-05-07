package POO.Restaurante;

public class PratoPicante extends Prato{
    public PratoPicante(String nome){
        super(nome);
    }

    @Override
    public void servir(){
        super.servir();
        System.out.println("Servindo o prato picante: " + nome);
    }

}
