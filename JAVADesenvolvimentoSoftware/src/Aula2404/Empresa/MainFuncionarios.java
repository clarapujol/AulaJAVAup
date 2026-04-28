package Aula2404.Empresa;

public class MainFuncionarios {
    public static void main (String[] args){

        Funcionarios f = new Funcionarios("Jobson");
        // f.nome = "Jobson";
        f.baterPonto();

        Gerente g = new Gerente("Claudia");
        // g.nome = "Claudia";
        g.baterPonto();
        g.curtirFerias();

        Vendedor v = new Vendedor("Carlão");
        // v.nome = "Carlão";
        v.vender();
        v.baterPonto();

    }
}
