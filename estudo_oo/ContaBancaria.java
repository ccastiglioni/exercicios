package estudo_oo;

/*
🏦 Exercício: Classe ContaBancaria
🎯 Objetivo:
Criar uma classe ContaBancaria que represente uma conta simples com saldo, titular e número da conta.
 A classe deve permitir depósitos e saques, com proteção adequada aos dados.

📝 Regras do exercício:
Crie a classe ContaBancaria com os seguintes atributos privados:
String titular
int numeroConta
double saldo

Crie os métodos públicos:
getTitular() e setTitular(String titular)
getNumeroConta() e setNumeroConta(int numero)
getSaldo() (⚠️ não crie o setSaldo diretamente)

Crie os métodos públicos:
depositar(double valor) → só permite depósito se o valor for positivo.
sacar(double valor) → só permite saque se houver saldo suficiente.

Crie um método:
exibirInformacoes() → que mostra: titular, número da conta e saldo formatado.
*/

class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;

    // Getters e Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido para depósito!");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.printf("Saldo: R$ %.2f\n", saldo);
    }
}
