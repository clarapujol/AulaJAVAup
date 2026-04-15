package Aula1504.Recap;

public class Main {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("Maria", 22);

        p.construirCasa("cwb", "oso", "rua", "123");
        p.construirCasa("sjp", "aeroporto-cwb", "aero", "A22");

        p.mostrarEndereco();


    }

}

