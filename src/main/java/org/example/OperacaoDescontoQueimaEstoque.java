package org.example;

public class OperacaoDescontoQueimaEstoque implements Operacao {

    public double calcular(double preco) {
        return preco - (preco * 0.5);
    }
}
