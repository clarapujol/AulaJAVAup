package Classes.ExCLASSETEXTOQuadrado;

public class MainQuadrado {

    public static void main(String[] args) {
    Quadrado q = new Quadrado(5); // instanciando a classe Quadrado, criando um objeto q do tipo Quadrado, com o valor do lado igual a 5

    // usando o GET para mostrar o lado
        System.out.println("Lado: " + q.getLado());

    // calculando a área do quadrado
        System.out.println("Area: " + q.calcularArea());

    // usando o SET para mudar o valor do lado
        q.setValorLado(10);
        System.out.println("Novo lado: " + q.getLado());
        System.out.println("Nova área: " + q.calcularArea());
    }
}
