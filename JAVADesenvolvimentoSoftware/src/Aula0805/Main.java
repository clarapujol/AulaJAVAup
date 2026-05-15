package Aula0805;

public class Main {
    public static void main(String[] args) {

//        List<Afinador> banda = new ArrayList<>();
//        banda.add( new Violao("violao") );
//        banda.add( new Flauta("flauta") );
//        //banda.add( new Sanfona() );
//        //banda.add( new Guitarra() );
//
//
//        List<Afinador> orquestra = new ArrayList<>();
//        orquestra.add( new Violao("violao") );
//        orquestra.add( new Flauta("flauta") );
//        orquestra.add( new Sanfona("sanfona") );
//        orquestra.add( new Guitarra("guitarra") );

//        Instrumento i = new Violao("b");
//        i.tocar();

        Violao v = new Violao("violaozin");
        Guitarra g = new Guitarra("guitarrinha");
        Musico m = new Musico();

        m.tocarInstrumento(v);
//        m.afinarInstrumento(g);

//        v.afinar();
//        v.mudarTom("E");

//        Flauta f = new Flauta();
//        f.afinar();
//        f.mudarTom("D");


    }
}
