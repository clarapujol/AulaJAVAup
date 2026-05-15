package ExAfinador1;
// -----------------------------------------------
// PASSO 5: Flauta — família Sopro, implementa Afinador
// Hierarquia diferente, mas mesmo contrato!
// -----------------------------------------------
public class Flauta extends InstrumentoSopro implements Afinador {

    public Flauta(String nome) {
        super("Flauta");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando Flauta...");
    }

    @Override
    public void mudarTom(String nota) {
        System.out.println("Mudando a nota da flauta para: " + nota);
    }
}
