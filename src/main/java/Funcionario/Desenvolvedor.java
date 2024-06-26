package Funcionario;

import Banco.AreaRestrita.AutenticacaoUtil;
import Banco.AreaRestrita.Autenticavel;

public class Desenvolvedor extends Funcionario implements Autenticavel {


    private AutenticacaoUtil autenticador;
    public Desenvolvedor(){
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        return 1000;
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
