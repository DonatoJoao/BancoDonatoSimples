package Conta;

public class ContaCorrente extends Conta {


    private double limiteEspecial = -1000;
    private double tarifaTransferencia = getTarifa().getTarifaTransferencia();
    private double tarifaSaque = getTarifa().getTarifaSaque();

    public ContaCorrente(int agencia, int numero, String nome, String cpf, int senha) {
        super(agencia, numero, nome, cpf, senha);
    }

    @Override
    public void saca(double valor) {

        System.out.println("Digite sua senha para Sacar");
        int senhaParaSacar = scanner.nextInt();

        if(senhaParaSacar == super.getTitular().getSenha()){
            if ((this.saldo-valor+tarifaSaque) >= limiteEspecial){
                super.saldo-=valor+tarifaSaque;
                System.out.println("Operação Realizada - Saque da Conta Corrente");
        } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Senha incorreta");
        }
    }

    @Override
    public void transfere(double valor, Conta contaDestino) {

        System.out.println("Digite sua senha para transferir");
        int senhaParaSacar = scanner.nextInt();
        if (senhaParaSacar==this.getTitular().getSenha()) {
            if ((this.saldo-valor+tarifaTransferencia) >= limiteEspecial){
                saldo-=valor+tarifaTransferencia;
                contaDestino.deposita(valor);

                System.out.println("Transferência realizada com sucesso");
            } else {
                System.out.println("O saldo para transferir é insuficiente");
            }
        } else {
            System.out.println("Senha incorreta");
        }
        }
    }

