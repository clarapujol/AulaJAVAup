package ExAfinador1;

// -----------------------------------------------
// PASSO 7: AfinadorUniversal
// Recebe uma List<Afinador> — não importa se é corda
// ou sopro, contanto que implemente Afinador.
// Percorre a lista e chama afinar() e mudarTom() de cada um.
// -----------------------------------------------

import java.util.List;

public class AfinadorUniversal {

    public void afinarTodos(List<Afinador> lista) {
/* O <Afinador> entre os sinais de menor/maior é o tipo genérico — ele diz "essa lista só
   aceita objetos Afinador". Poderia ser List<String>, List<Integer>, etc.    */
        for (Afinador instrumento : lista) {
/* Lê-se: "para cada instrumento do tipo Afinador dentro de lista"
É como dizer: "pegue cada item da lista, um por um, chame esse item de instrumento,
e execute o bloco"*/
            instrumento.afinar();
            instrumento.mudarTom("Dó");
        }
    }
}
/*
O nome instrumento é só uma variável local temporária — poderia ser qualquer nome (i, a, x).
O que importa é o tipo (Afinador) bater com o que está dentro da lista (List<Afinador>).
 */