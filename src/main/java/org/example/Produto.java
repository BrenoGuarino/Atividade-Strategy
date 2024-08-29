package org.example;

public class Produto {

    private double preco;

    public double getPreco() {
        return preco;
    }

    public void precificarDescontoCupom(double preco) {
        CalculadoraDePreco calculadora = new CalculadoraDePreco(preco);
        this.preco = calculadora.calcular(new OperacaoDescontoCupom());
    }

    public void precificarQueimarEstoque(double preco) {
        CalculadoraDePreco calculadora = new CalculadoraDePreco(preco);
        this.preco = calculadora.calcular(new OperacaoDescontoQueimaEstoque());
    }

    public void precificarProdutoAvariado(double preco) {
        CalculadoraDePreco calculadora = new CalculadoraDePreco(preco);
        this.preco = calculadora.calcular(new OperacaoProdutoAvariado());
    }


    public void precificarImposto(double preco) {
        CalculadoraDePreco calculadora = new CalculadoraDePreco(preco);
        this.preco = calculadora.calcular(new OperacaoImposto());
    }

}