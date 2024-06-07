import Conta.ContaCorrente;
import Conta.ContaPoupanca;

public class TesteSenha {


    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(77,7777,"Masha","123",1234);
//        conta.deposita(1000);
//        conta.exibeSaldo();
//        conta.saca(400);
        //conta.exibeSaldo();
        ContaPoupanca contaPoupanca = new ContaPoupanca(77,7777,"Masha2","123",1234);
        //conta.transfere(1,contaPoupanca);
        //conta.exibeSaldo();
       // contaPoupanca.exibeSaldo();
        conta.deposita(50);
        conta.saca(50);
        conta.exibeSaldo();




    }
}
