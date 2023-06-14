package Exercicio1;
public class Produtos {
    public double verificarProduto() {
        double produtoUm = 12.00;
        double produtoDois = 15.00;
        double produtoTres = 18.00;
        try {
            if(produtoUm < produtoDois && produtoUm < produtoTres) {
                System.out.println("Você deve adquirir o produto 1 pois é o mais barato!");
            } else if (produtoDois < produtoUm && produtoDois < produtoTres) {
                System.out.println("Você deve adquirir o produto 2 pois é o mais barato!");
            } else if (produtoTres < produtoDois && produtoTres < produtoUm) {
                System.out.println("Você deve adquirir o produto 3 pois é o mais barato!");
            }
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return produtoUm;
    }
}
