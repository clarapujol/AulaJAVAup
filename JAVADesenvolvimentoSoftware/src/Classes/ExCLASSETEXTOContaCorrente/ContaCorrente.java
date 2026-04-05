package Classes.ExCLASSETEXTOContaCorrente;

/*
Classe Conta Corrente: Crie uma classe para implementar uma conta corrente.
A classe deve possuir os seguintes atributos: número da conta, nome do correntista e saldo.
Os métodos são os seguintes: alterarNome, depósito e saque;
No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.
 */

public class ContaCorrente {

    float numeroConta;
    String nomeCorrentista;
    float saldo;

    // construtor com saldo obrigatório
    public ContaCorrente(float numeroConta, String nomeCorrentista, float saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    // construtor com saldo opcional, valor default zero
    public ContaCorrente(float numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0; // ou this.saldo = 0;
    }

    // GET pegar numero da conta
    public float getNumeroConta(){
        return this.numeroConta;
    }

    // GET pegar nome do correntista
    public String getNomeCorrentista(){
        return this.nomeCorrentista;
    }

    // GET pegar saldo
    public float getSaldo(){
        return this.saldo;
    }

    // metodo alterar nome
    public void alterarNome(String novoNome){
        this.nomeCorrentista = novoNome;
    }

    // metodo alterar deposito
    public void deposito(float valorDeposito){
        this.saldo = valorDeposito + this.saldo;
    }

    // metodo saque
    public void metodoSaque(float valorSaque){
        if (valorSaque > this.saldo){
            System.out.print("\nSaldo insuficiente para realizar o saque.");
        }else {
            this.saldo = this.saldo - valorSaque; // ou this.saldo -= valorSaque;
        }
    }
}