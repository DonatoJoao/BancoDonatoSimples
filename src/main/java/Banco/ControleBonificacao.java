package Banco;

import Funcionario.Funcionario;

public class ControleBonificacao {

    private double soma;

    public void geradorBonificacao( Funcionario funcionario){
        double bonificacao = funcionario.getBonificacao();
        this.soma+=bonificacao;
    }

    public double getSoma() {
        return soma;
    }
}
