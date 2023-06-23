public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("José", 1000.0);
        banco.sacar(500.0);
        banco.depositar(10);
    }
}

