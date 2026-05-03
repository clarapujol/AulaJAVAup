package POO.Loja;

public class Seguranca extends Funcionario{
    public Seguranca(String nome){
        super(nome);
    }

    void cuidarLocal(){
        System.out.println("Segurança " + nome + " Está cuidando da loja...");
    }
}
