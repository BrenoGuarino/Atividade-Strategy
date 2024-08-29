package org.example;

public class CalculadoraDePreco {

    private double preco;

    public CalculadoraDePreco(double preco) {
        this.preco = preco;
    }

    public double calcular(Operacao operacao) {
        return operacao.calcular(preco);
    }
}