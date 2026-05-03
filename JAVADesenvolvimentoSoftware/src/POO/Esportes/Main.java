package POO.Esportes;

public class Main {
    public static void main(String[] args) {
        Corredor c = new Corredor("Bolt");
        c.treinar();
        c.competir();

        Lutador l = new Lutador("Du Bronxs");
        l.treinar();
        l.competir();

        Nadador n = new Nadador("Felps");
        n.treinar();
        n.competir();
    }
}
