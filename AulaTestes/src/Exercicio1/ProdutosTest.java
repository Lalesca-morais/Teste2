package Exercicio1;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ProdutosTest {
    @Test
    public void verificarSeProdutoEMaisBarato() {
        Produtos produtos = new Produtos();
        double produtoTest = produtos.verificarProduto();

        assertEquals(12.00, produtoTest);


    }
}
