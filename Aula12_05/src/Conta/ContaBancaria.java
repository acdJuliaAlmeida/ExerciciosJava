package Conta;

public class ContaBancaria {
    public String titular;
    private Double saldo = 0.0;

    public ContaBancaria(String titular){
        this.titular = titular;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if (valor < saldo){
            saldo -= valor;
        }else{
        System.out.println("Saldo insuficiente.");
        }

    }

    public void mostrarSaldo(){
        System.out.println( titular + "! Seu saldo é: R$" + saldo);
    }

}
