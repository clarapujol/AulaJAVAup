package POO.Loja;

public class Main {
    public static void main(String[] args){
        Caixa c = new Caixa("Guinho");
        c.trabalhar();
        c.registrarCompra();

        Estoquista e = new Estoquista("Zezinho");
        e.trabalhar();
        e.organizarEstoque();

        Seguranca s = new Seguranca("Luizinho");
        s.trabalhar();
        s.cuidarLocal();

        Gerente g = new Gerente("Tio Patinhas");
        g.trabalhar();
        g.abrirLoja();

    }
}
