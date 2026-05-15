/*
“Afinador”: qualquer instrumento pode ter, mas nem todo instrumento possui um afinador embutido.

Eles pertencem à mesma hierarquia, porém apenas os instrumentos definidos pela interface
terão essa funcionalidade.

Instrumento é a família — todo mundo herda
Afinador é uma habilidade extra — só quem quiser implementa

instanceof = "isso aí dentro é um violão?"
(Violao) = "me dá o violão que tá dentro"


Todos estendem Instrumento, todos implementam Afinador. Só o Violao tem o metodo extra
tocarMusicaCompleta(), por isso o instanceof foi necessário pra acessá-lo.


       Instrumento (abstract)
       /      |      \       \
  Violao  Guitarra  Flauta  Sanfona
    |         |        |       |
    +----+----+--------+-------+
         |
      Afinador (interface)
    afinar() / mudarTom()


>> Instanceof e casting — a parte mais nova
if (instrumento instanceof Violao) {
    // Java ainda acha que é só um Instrumento
    // então você precisa "converter" pra Violao
    Violao meuViolao = (Violao) instrumento;
    meuViolao.tocarMusicaCompleta();
}

>> Receber Instrumento ou Afinador como parâmetro
// aceita qualquer coisa que seja Instrumento
public void tocarInstrumento(Instrumento instrumento) { }

// aceita qualquer coisa que implemente Afinador
public void afinarInstrumento(Afinador afinador) { }
 */
