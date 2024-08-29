import org.example.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTeste {

    @Test
    void devePrecificarDescontoCupom() {
        Produto produto = new Produto();
        produto.precificarDescontoCupom(100);
        assertEquals(80, produto.getPreco());
    }
    @Test
    void devePrecificarProdutoAvariado() {
        Produto produto = new Produto();
        produto.precificarProdutoAvariado(100);
        assertEquals(20, produto.getPreco());
    }

    @Test
    void devePrecificarImposto() {
        Produto produto = new Produto();
        produto.precificarImposto(100);
        assertEquals(120, produto.getPreco());
    }

    @Test
    void devePrecificarQueimarEstoque() {
        Produto produto = new Produto();
        produto.precificarQueimarEstoque(100);
        assertEquals(50, produto.getPreco());
    }



}