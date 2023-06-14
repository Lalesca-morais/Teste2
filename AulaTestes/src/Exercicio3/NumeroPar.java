package Exercicio3;

public class NumeroPar {
    public int verificarNumero() {
        int numero = 8;
        if(numero % 2 == 0) {
            System.out.println(numero + " é um número par!");
        } else {
            System.out.println(numero + " é um número ímpar!");
        }
        return numero;
    }
}

