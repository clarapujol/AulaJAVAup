package ExAfinador1;
// -----------------------------------------------
// PASSO 6: Trompete — família Sopro, implementa Afinador
// -----------------------------------------------
public class Trompete extends InstrumentoSopro implements Afinador {

    public Trompete(String nome) {
        super("Trompete");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando Trompete...");
    }

    @Override
    public void mudarTom(String nota) {
        System.out.println("Mudando a nota do trompete para: " + nota);
    }
}
