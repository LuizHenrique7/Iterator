import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class EstoqueTest {

    @Test
    void deveContarComputadoressAtivosLoja() {
        Loja loja = new Loja(
                new Computador("MacBook", true),
                new Computador("Dell Inspiron", true),
                new Computador("HP Pavilion", false),
                new Computador("Lenovo ThinkPad", true)
        );
        assertEquals(3, Estoque.contarComputadoresAtivosLoja(loja));
    }

    @Test
    void deveContarTotalComputadoresLoja() {
        Loja loja = new Loja(
                new Computador("MacBook", true),
                new Computador("Dell Inspiron", true),
                new Computador("HP Pavilion", false),
                new Computador("Lenovo ThinkPad", true)
        );
        assertEquals(4, Estoque.contarTotalComputadoresLoja(loja));
    }

}