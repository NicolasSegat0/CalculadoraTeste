package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import main.Multiplicacao;

public class TestMultiplicacao {
	public void testMultiplicacao() {
        assertEquals(5, Multiplicacao.multiplicar(2, 5));
    }

}
