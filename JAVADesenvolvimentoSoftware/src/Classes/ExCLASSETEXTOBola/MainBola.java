package Classes.ExCLASSETEXTOBola;

public class MainBola  {

    public static void main(String[] args){
        Bola b = new Bola("vermelha", 68.5f, "couro");
        //Bola b → cria uma variável do tipo Bola chamada b
        //new Bola(...) → chama o construtor e cria a bola na memória
        //Os valores "vermelha", 68.5, "couro" são enviados para o construtor


        // Mostrando a cor atual
        b.mostraCor(); // A cor da bola é: vermelha

        // Trocando a cor
        b.trocaCor("azul");

        // Mostrando a nova cor
        b.mostraCor(); // A cor da bola é: azul
        /*
        ## 🔁 Resumo do fluxo completo
            Cria a bola ("vermelha", 68.5, "couro")
                   ↓
            Mostra cor → "vermelha"
                   ↓
            Troca cor → "azul"
                   ↓
            Mostra cor → "azul"
         */

    }

}
