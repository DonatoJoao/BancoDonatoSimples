package Banco.Tributos;

public class CalculadoraDeImpostos {

    private double totalImposto;

    public void geradorDeImposto(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto+=valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
