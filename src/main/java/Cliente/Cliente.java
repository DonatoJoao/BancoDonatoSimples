package Cliente;

public class Cliente {

    private String nome;
    private String cpf;
    private int senha;
    private Endereco endereco;

    public Cliente(String nome, String cpf, int senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.endereco = new Endereco();

    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Integer getSenha() {
        return senha;
    }


    public Endereco getEndereco() {
        return endereco;
    }
}
