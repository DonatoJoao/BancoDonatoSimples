package Conta;

public class TarifaBancaria {

    private double tarifaSaque = 2;
    private double tarifaTransferencia = 10;
    private ContaDoBanco contaDoBanco;

    public ContaDoBanco getContaDoBanco() {
        return contaDoBanco;
    }
    public void depositaTarifaContaBanco(double tarifaTransferencia){

    }

    public double getTarifaSaque() {
        return tarifaSaque;
    }

    public double getTarifaTransferencia() {
        return tarifaTransferencia;
    }
}
