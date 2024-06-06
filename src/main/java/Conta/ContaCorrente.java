package Conta;

public class ContaCorrente extends Conta {

    private double limiteEspecial = -1000;

    public ContaCorrente(int agencia, int numero, String nome, String cpf, int senha) {
        super(agencia, numero, nome, cpf, senha);
    }

    @Override
    public void saca(double valor) {
        if(valor>=limiteEspecial){
            this.saldo-=valor;
        } else {
            System.out.println("Limite indisponível");
        }
    }

    @Override
    public void transfere(double valor, Conta contaDestino) {
        if (valor>limiteEspecial){
            this.saca(valor);
            contaDestino.deposita(valor);
        }
    }
}
