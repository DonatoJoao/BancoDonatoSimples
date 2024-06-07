package Funcionario;

public abstract class Funcionario {

    private String nome;
    private String cpf;
    private String cargo; //fazer um Enum?
    private double salario;



    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }

    public abstract double getBonificacao();
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
}
