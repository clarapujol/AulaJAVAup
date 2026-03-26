package Aula2503ClasseseEncapsulamento.ExemploCliente;

import java.util.Scanner;

public class InputHelper {
    static Scanner scan = new Scanner(System.in);

    public static String lerTexto(String textinho){
        System.out.print(textinho);
        return scan.nextLine();
    }

    public static int lerNumero(String texto){
        return Integer.parseInt( lerTexto(texto) );
    }

    /*public static int pegarNumeroRange(){

    }*/

}
