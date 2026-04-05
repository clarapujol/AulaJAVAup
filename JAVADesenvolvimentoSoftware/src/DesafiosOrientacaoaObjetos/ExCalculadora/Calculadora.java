package DesafiosOrientacaoaObjetos.ExCalculadora;

/*
“Crie uma classe `Calculadora` que contenha métodos para adicionar, subtrair, multiplicar e
dividir, aceitando dois números reais como parâmetros para cada metodo e retornando o resultado.

Estes métodos devem ser estáticos.

Logo, não será necessário instanciar um objeto do tipo Calculadora para poder utilizar esses
métodos.

Certifique-se de que a divisão por zero seja tratada de maneira a evitar erros de execução.”
 */

public class Calculadora {

    static double num1;
    static double num2;


    // metodo estático para somar
    public static double somar(double num1, double num2){
        return num1 + num2;
    }

    // metodo estático para subtrair
    public static double subtrarir(double num1, double num2){
        return num1 - num2;
    }

    // metodo estático para multiplicar
    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }

    // metodo estático para dividir
    public static double dividir(double num1, double num2){
        if (num2 == 0){
            System.out.print("Erro! Divisão por zero não é permitida.");
            return 0; // ou poderia lançar uma exceção, dependendo do design desejado
        }
        return num1 / num2;
    }



}


