package Classes.ExCLASSETEXTOContaCorrente;
import java.util.Scanner;

public class MainContaCorrente {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        // construtor SEM SALDO obrigatório, valor default zero
        ContaCorrente conta1 = new ContaCorrente(12345, "Clara");

        // mostrar numero da conta, nome do correntista e saldo
        System.out.print("Numero da conta: " + conta1.getNumeroConta());
        System.out.print("\nNome do correntista: " + conta1.getNomeCorrentista());
        System.out.print("\nSaldo: " + conta1.getSaldo());


        // realizar deposito
        System.out.print("\n---Realizando depósito... (R$ 500)---");
        conta1.deposito(500);
        System.out.print("\nSaldo: " + conta1.getSaldo());

        // realizar saque
        System.out.print("\n---Realizando saque... (R$ 200)---");
        conta1.metodoSaque(200);
        System.out.print("\nSaldo: " + conta1.getSaldo());

        // realizar saque com valor maior que o saldo
        System.out.print("\n---Tentando sacar... (R$ 400)---");
        conta1.metodoSaque(400);
        System.out.print("\nSaldo: " + conta1.getSaldo());

        // alterar nome do correntista
        System.out.print("\n=============Alterando nome do correntista=============");
        conta1.alterarNome("Mariazinha");
        System.out.print("\nNome do correntista: " + conta1.getNomeCorrentista());


        // construtor COM SALDO obrigatório
        ContaCorrente conta2 = new ContaCorrente(54321, "João", 1000);

        // mostrar numero da conta, nome do correntista e saldo
        System.out.print("\n\nNumero da conta: " + conta2.getNumeroConta());
        System.out.print("\nNome do correntista: " + conta2.getNomeCorrentista());
        System.out.print("\nSaldo: " + conta2.getSaldo());

        leitor.close();
    }



}
