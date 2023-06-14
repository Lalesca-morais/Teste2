package Exercicio4;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ContaCorrenteTest {
    ContaCorrente contaCorrente = new ContaCorrente(87567, "Joao", 1000.00);
    @Test
    public void conferirDepositoDoCorrentista() {
        double resultado = contaCorrente.depositoConta();
        assertEquals(0, resultado);
    }
    @Test
    public void conferirSaqueDoCorrentista() {
        double resultado = contaCorrente.saqueConta();

        assertEquals(0, resultado);
    }
}
