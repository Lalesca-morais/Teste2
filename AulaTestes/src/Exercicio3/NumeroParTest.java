package Exercicio3;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
// nao consegui achar outro jeito de validar o numero
public class NumeroParTest {
    NumeroPar numeroPar = new NumeroPar();
    @Test
    public void verificarSeNumeroEPar() {
        int resultado = numeroPar.verificarNumero();
        assertEquals(8, resultado);
    }
}
