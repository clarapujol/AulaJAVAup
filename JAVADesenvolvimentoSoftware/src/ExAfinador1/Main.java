package ExAfinador1;

import java.util.ArrayList;
import java.util.List;

// -----------------------------------------------
// PASSO 8: Main — juntando tudo
//
// Repara que a lista é do tipo List<Afinador>.
// Violao e Guitarra são InstrumentoCorda.
// Flauta e Trompete são InstrumentoSopro.
// Mas os QUATRO cabem na mesma lista porque todos
// implementam Afinador. ISSO é polimorfismo!
// -----------------------------------------------
public class Main {
    public static void main (String[] args){

        Violao v = new Violao("Violão");
        Guitarra g = new Guitarra("Guitarra");
        Flauta f = new Flauta("Flauta");
        Trompete t = new Trompete("Trompete");

        // Lista do tipo Afinador — aceita qualquer um que implemente a interface
        List<Afinador> orquestra = new ArrayList<>();
        // Implementando afinador
        orquestra.add(v);
        orquestra.add(g);
        orquestra.add(f);
        orquestra.add(t);

        // AfinadorUniversal afina todos de uma vez
        AfinadorUniversal afinandoGeral = new AfinadorUniversal();
        afinandoGeral.afinarTodos(orquestra);
    }
}
