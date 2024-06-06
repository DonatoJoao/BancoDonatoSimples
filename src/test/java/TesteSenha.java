import Conta.ContaCorrente;
import Conta.ContaPoupanca;

public class TesteSenha {


    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(77,7777,"Masha","123",1234);
        conta.deposita(3000);
        //conta.saca(400);
        //conta.exibeSaldo();
        ContaPoupanca contaPoupanca = new ContaPoupanca(77,7777,"Masha2","123",1234);
        conta.transfere(100,contaPoupanca);
        conta.exibeSaldo();
        contaPoupanca.exibeSaldo();
        contaPoupanca.saca(200);

    }
}
