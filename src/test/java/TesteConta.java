import Conta.ContaCorrente;
import Conta.ContaPoupanca;

public class TesteConta {
        public static void main(String[] args) {


                ContaCorrente contaJoao = new ContaCorrente(77, 7777, "João", "123456789", 1234);
                ContaPoupanca contaPri = new ContaPoupanca(77,7778,"Priscila Donato", "456789132", 1234);
                System.out.println(contaJoao.getTitular().getNome());
                contaJoao.deposita(5000);
                System.out.println(contaJoao.getSaldo());
                contaJoao.transfere(4000,contaPri);
                System.out.println(contaPri.getSaldo());
                System.out.println("saldo " + contaJoao.getTitular().getNome()+ " " + contaJoao.getSaldo());
                System.out.println(contaJoao.getTitular().getClass());
                System.out.println(contaJoao.getClass());
                contaJoao.saca(1900);
                System.out.println("saldo " + contaJoao.getTitular().getNome()+ " " + contaJoao.getSaldo());
        }
}