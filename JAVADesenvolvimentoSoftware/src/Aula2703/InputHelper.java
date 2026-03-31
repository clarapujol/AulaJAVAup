package Aula2703;

import java.util.Scanner;

public class InputHelper {

    static Scanner scan = new Scanner(System.in);

    public static String lerTexto(String textinho){
        System.out.print(textinho);
        return scan.nextLine();
    }

    public static int lerNumeroInt(String texto){
        return Integer.parseInt( lerTexto(texto) );
    }

    public static float lerNumeroFloat(String texto){
        return Float.parseFloat( lerTexto(texto) );
    }

}


/* Em resumo, esse código define uma classe chamada InputHelper que fornece
métodos estáticos para ler diferentes tipos de entrada do usuário. A classe
utiliza um objeto Scanner para ler a entrada do console. O etodo lerTexto
solicita ao usuário que insira um texto e retorna a string digitada. O metodo
lerNumeroInt solicita ao usuário que insira um número inteiro e retorna o valor
convertido para int. O metodo lerNumeroFloat solicita ao usuário que insira um
número decimal e retorna o valor convertido para float. Esses métodos facilitam
a leitura de diferentes tipos de dados a partir da entrada do usuário, tornando
o código mais organizado e reutilizável. */
