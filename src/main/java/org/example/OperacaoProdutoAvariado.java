package org.example;

public class OperacaoProdutoAvariado implements Operacao {

    public double calcular(double preco) {
        return preco - (preco * 0.8);
    }
}
