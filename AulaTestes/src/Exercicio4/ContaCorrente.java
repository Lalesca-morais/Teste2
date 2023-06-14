package Exercicio4;
public class ContaCorrente {
    double numeroConta;
    String nomeCorrentiste;
    double saldo;
    public ContaCorrente(double numeroConta, String nomeCorrentiste, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentiste = nomeCorrentiste;
        this.saldo = saldo;
    }
    public double depositoConta() {
        return saldo += saldo;
    }
    public double saqueConta() {
        if (saldo < 5) {
            System.out.println("Não é permitido sacar valor menor que R$5,00");
        } else {
            this.saldo -= saldo;
        }
        return saldo;
    }
}