package Funcionario;

public abstract class Funcionario {

    private String nome;
    private String cpf;
    private String cargo; //fazer um Enum?
    private double salario;

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
