package ExAfinador1;
// -----------------------------------------------
// PASSO 4: Guitarra — família Corda, implementa Afinador
// -----------------------------------------------
public class Guitarra extends InstrumentoCorda implements Afinador {
    public Guitarra(String nome) {
        super("Guitarra");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando Guitarra....");
    }

    @Override
    public void mudarTom(String nota) {
        System.out.println("Mudando a nota da guitarra para: " + nota);
    }
}
