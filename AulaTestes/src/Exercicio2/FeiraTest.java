package Exercicio2;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FeiraTest {
    Feira feira = new Feira();
    @Test
    public void conferirDiaDaSemana() {
    int diaDaSemanaTest = feira.feiraDomingo();

    assertEquals(0, diaDaSemanaTest);
    }
}
