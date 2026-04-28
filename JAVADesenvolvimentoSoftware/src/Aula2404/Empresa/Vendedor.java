package Aula2404.Empresa;

import javax.xml.transform.Source;

public class Vendedor extends Funcionarios{

    public Vendedor(String nome){
        super(nome);
    }

    void vender(){
        System.out.println("Venda realizada com sucesso!");
    }
}
