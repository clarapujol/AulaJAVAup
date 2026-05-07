package POO.Restaurante;

public class PratoVegano extends Prato{
    public PratoVegano(String nome){
        super(nome);
    }

    @Override
    public void servir(){
        super.servir(); // aproveita o print do pai
        System.out.println("Servindo o prato vegano: " + nome);
    }
}
