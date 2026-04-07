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

    // static = não precisa criar objeto, chama direto pela classe
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b){
        return a - b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static double dividir(double a, double b){
        if (b == 0){
            System.out.println("Não foi possivel completar essa conta, o valor de B deve ser maior que zero");
            return 0;
        }else {
            return a / b;
        }
    }

}


