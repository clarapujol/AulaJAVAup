package POO.ExInstrumentos;

public class Main {
    public static void main (String[] args){
        Bateria b = new Bateria();
        Flauta f = new Flauta();
        Guitarra g = new Guitarra();

        b.tocar();
        f.tocar();
        g.tocar();
    }
}
