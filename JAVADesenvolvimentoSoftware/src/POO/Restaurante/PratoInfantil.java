package POO.Restaurante;

// DESAFIO: crie um PratoInfantil que estende Prato,
// use super.servir() e adicione uma mensagem especial pras crianças.

public class PratoInfantil extends Prato{
    public PratoInfantil(String nome){
        super(nome);
    }

    @Override
    public void servir(){
        super.servir();
        System.out.println("Servindo pratinho de criança: " + nome);
    }
}
