public class Banco {
    private String nomeCliente;
    private double saldo;
    public Banco(String nomeCliente, double saldoInicial) {
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
    }
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.\nSaldo Atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }
}
