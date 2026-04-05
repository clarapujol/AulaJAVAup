package DesafiosOrientacaoaObjetos.ExContaBancaria;

/*
“Projete uma classe ContaBancaria que encapsule os atributos de uma conta
 como numeroConta, nomeTitular e saldo.
 Utilize modificadores de acesso para garantir o encapsulamento e a segurança dos dados.

 Implemente métodos para depositar(valor), sacar(valor)

 e um metodo que retorne o saldo atual da conta.

 Lembre-se de que cada operação deve ajustar o saldo da conta de acordo com a transação
 realizada.”

 += -> operador de atribuição que soma o valor à variável, ou seja, saldo atual + valor depositado
 && -> operador lógico AND, ou seja, as duas condições precisam ser verdadeiras
 */

public class ContaBancaria {

    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    // construtor
    public ContaBancaria(int numeroConta, String nomeTitular){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0; // saldo inicial da conta é zero, independentemente do valor passado como parâmetro
    }

    // GET - retornam os valores dos atributos privados
    public int getNumeroConta(){
        return this.numeroConta;
    }

    public String getNomeTitular(){
        return this.nomeTitular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    // metodo para depositar valor
    public void depositar(double valor){ // metodo para depositar valor, recebe o valor do deposito como parâmetro
        if (valor > 0){ // valor do deposito é maior que zero
            this.saldo += valor; // saldo atual + valor depositado
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso!");
        }else {
            System.out.println("Valor de deposito inválido! O valor deve ser maior que zero.");
        }
    }

    // metodo para sacar valor
    public void sacar(double valor, double saldo){ // metodo para sacar valor, recebe o valor do saque e o saldo atual da conta como parâmetros
        if (valor <= 0) { // valor do saque é menor ou igual a zero
            System.out.println("Valor inválido para saque!");
        } else if (valor > this.saldo) { // valor do saque é maior do que o saldo disponível
            // não permite sacar mais do que tem
            System.out.println("Saldo insuficiente!");
        } else {
            this.saldo -= valor; // saldo atual - valor sacado
            System.out.println("Saque de R$" + valor + " realizado!");
        }
    }

}
