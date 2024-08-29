package org.example;

public class OperacaoImposto implements Operacao {

    public double calcular(double preco) {
        return preco + (preco * 0.2);
    }
}