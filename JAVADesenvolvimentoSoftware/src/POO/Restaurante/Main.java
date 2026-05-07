package POO.Restaurante;

public class Main {
    public static void main (String[] args){
        PratoPicante picante = new PratoPicante("Frango Super Apimentado");
        picante.servir();

        System.out.println("===---===---===---===---");

        PratoVegano vegano = new PratoVegano("Salada Ceasar");
        vegano.servir();

        System.out.println("===---===---===---===---");

        PratoInfantil infantil = new PratoInfantil("Batata de sorriso");
        infantil.servir();
    }
}
