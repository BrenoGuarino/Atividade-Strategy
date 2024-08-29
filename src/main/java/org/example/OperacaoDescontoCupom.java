package org.example;

public class OperacaoDescontoCupom implements Operacao {

    public double calcular(double preco) {
        return preco - (preco * 0.2);
}
}