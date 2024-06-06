package Conta;

import Cliente.Cliente;

import java.util.Scanner;

public abstract class Conta {
    Scanner scanner = new Scanner(System.in);
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
    public void saca(double valor ) {
        System.out.println("Digite sua senha");
        int senhaParaSacar = scanner.nextInt();
            if (senhaParaSacar==this.getTitular().getSenha()) {
                if (this.saldo >= valor){
                    this.saldo -= valor;
                    System.out.println("Saque autorizado");
                } else {
                    System.out.println("Saldo insuficiente");
                }
            }else {
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
