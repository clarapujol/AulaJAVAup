package ExAfinador1;

// -----------------------------------------------
// PASSO 3: Violao — família Corda, implementa Afinador
// extends InstrumentoCorda = pertence à família cordas
// implements Afinador      = assina o contrato de afinar
// -----------------------------------------------
public class Violao extends InstrumentoCorda implements Afinador{
    public Violao(String nome) {
        super("Violão");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando Violão...");
    }

    @Override
    public void mudarTom(String nota) {
        System.out.println("Mudando a nota do violão para: " + nota);
    }



}
