package Funcionario;

import Banco.AreaRestrita.AutenticacaoUtil;
import Banco.AreaRestrita.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
    private AutenticacaoUtil autenticador;

    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        return super.getSalario(); //bonificação do gerente aqui está dando um salário inteiro de bonus
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
