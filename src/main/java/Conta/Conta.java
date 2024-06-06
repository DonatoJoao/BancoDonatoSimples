package Conta;

import Cliente.Cliente;

public abstract class Conta {

    private int agencia;
    private int numero;
    public double saldo;
    private Cliente titular;

    public Conta(int agencia, int numero, String nome, String cpf,int senha) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = new Cliente(nome,cpf,senha);
    }

    //sacar
    public void saca(double valor){
        if (this.saldo>= valor){
            this.saldo-=valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    //depositar
    public void deposita(double valor){
        this.saldo+=valor;
    }

    //transferir
    public void transfere(double valor, Conta contaDestino){
        this.saca(valor);
        contaDestino.deposita(valor);
    }


    //saldo
    public void exibeSaldo(){
        System.out.println(this.getTitular().getNome() + ", seu saldo é de: " + this.saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

}
