package Funcionario;

public class Atendente extends Funcionario{

    @Override
    public double getBonificacao() {
        return super.getSalario()*0.1;
    }
}
