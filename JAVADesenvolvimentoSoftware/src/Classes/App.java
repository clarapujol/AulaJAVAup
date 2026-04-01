package Classes;

public class App {

    public static void main(String[] args){
        // Iphone 12, tela de 6.1', 256gb
        // Galaxy Note 20 Ultra, tela de 6.9', 256gb
        // Xiomi Mi 11 Pro, tela de 6.81', 128gb

        // criar >variavel do tipo classe<, vai estar criando um >objeto<
        OqueEclasseCELULAR celularA = new OqueEclasseCELULAR(); // declarando uma variavel do tipo celular
        celularA.nome = "Iphone 12"; // atribuindo o valor "Iphone 12" ao atributo nome do objeto celularA
        celularA.tamanhoTela = 6.1f; // atribuindo o valor 6.1 ao atributo tamanhoTela do objeto celularA
        celularA.armazenamento = 256; // atribuindo o valor 256 ao atributo armazenamento do objeto celularA
        celularA.sistemaOperacional = "iOS"; // atribuindo o valor "iOS" ao atributo sistemaOperacional do objeto celularA

        OqueEclasseCELULAR celularB = new OqueEclasseCELULAR();
        celularB.nome = "Galaxy Note 20 Ultra";
        celularB.tamanhoTela = 6.9f;
        celularB.armazenamento = 256;
        celularB.sistemaOperacional = "Android";

        OqueEclasseCELULAR celularC; // declarando um objeto chamado celularC
        celularC = new OqueEclasseCELULAR();
        celularC.nome = "Xiomi Mi 11 Pro";
        celularC.tamanhoTela = 6.81f;
        celularC.armazenamento = 128;
        celularC.sistemaOperacional = "Android";


        // ao inves de fazer: "Celular" + celularA.nome + " com tela de " + celularA.tamanhoTela + ", armazenamento de " + celularA.armazenamento + " e Sistema Operacional " + celularA.sistemaOperacional
        System.out.format("Celular %s com tela de %.1f, armazenamento de %dgb e Sistema Operacional %s\n", celularA.nome, celularA.tamanhoTela, celularA.armazenamento, celularA.sistemaOperacional);

        System.out.format("Celular %s com tela de %.1f, armazenamento de %dgb e Sistema Operacional %s\n", celularB.nome, celularB.tamanhoTela, celularB.armazenamento, celularB.sistemaOperacional);

        System.out.format("Celular %s com tela de %.2f, armazenamento de %dgb e Sistema Operacional %s", celularC.nome, celularC.tamanhoTela, celularC.armazenamento, celularC.sistemaOperacional);
    }



}
