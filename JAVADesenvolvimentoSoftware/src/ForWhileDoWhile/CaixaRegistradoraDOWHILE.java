package ForWhileDoWhile;
import java.util.Scanner;

/*
O cliente insere dinheiro para pagar um produto de R$ 50,00. Se ele
pagar menos, o sistema continua pedindo mais dinheiro até completar
o valor. Quando o valor for atingido ou ultrapassado, o troco deve ser
calculado.
Dica: Use um do-while para garantir que pelo menos uma inserção de
dinheiro seja feita.
 */


public class CaixaRegistradoraDOWHILE {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        float valorProduto = 50.00f; // double -> tipo de dado para números decimais, ou seja, com casas decimais
        float valorPago = 0.00f; // double -> tipo de dado para números decimais, ou seja, com casas decimais


        do { // o do-while garante que o programa continue pedindo dinheiro até que o valor pago seja igual ou maior que o valor do produto
            System.out.print("Dinheiro inserido: R$ " + valorPago);
            System.out.print("\nInsira o valor para pagar o produto: ");
            float valorInserido = leitor.nextFloat();
            valorPago = valorPago + valorInserido;

            if (valorPago < valorProduto){ // o if verifica se o valor pago é menor que o valor do produto, ou seja, se o cliente ainda não pagou o suficiente para comprar o produto
                System.out.println("Valor insuficiente. Por favor, insira mais dinheiro.");
            }
        }while (valorPago < valorProduto); // o do-while garante que o programa continue pedindo dinheiro até que o valor pago seja igual ou maior que o valor do produto

        float troco = valorPago - valorProduto; // o troco é calculado subtraindo o valor do produto do valor pago

        if (troco > 0){ // o if verifica se o troco é maior que 0, ou seja, se o cliente pagou mais do que o valor do produto e tem direito a receber troco
            System.out.printf("Como seu valor foi maior que R$50,00, seu troco é de: R$ " + troco);
        } else{
            System.out.println("Pagamento completo. Obrigado pela compra!");
        }
        leitor.close();
    }


}
