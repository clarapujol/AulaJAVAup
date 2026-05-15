package Aula0805;

public class Musico {

    public void tocarInstrumento(Instrumento instrumento){
        System.out.println("O músico está: ");
        instrumento.tocar();

        // descobrir tipo do instrumento
        if (instrumento instanceof Violao){ // instrumento é um violão?
            //instrumento.tocarMusicaCompleta(); // toca a musica completa no instrumento, se for o violao

            ( (Violao) instrumento ).tocarMusicaCompleta(); // converter o instrumento em violao
            // a mesma coisa em cima e em baixo
            Violao meuViolao = (Violao) instrumento; // transformei em instrumento e salvei na variavel, se fosse new Violao() estaria criando
            meuViolao.tocarMusicaCompleta();
        }else{
            instrumento.tocar(); // tocar musica simples
        }
    }

    public void afinarInstrumento(Afinador afinador){
        afinador.afinar();
        afinador.mudarTom("A");
    }
}
