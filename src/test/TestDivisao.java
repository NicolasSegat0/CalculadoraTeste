package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import main.Divisao;

public class TestDivisao {
	public void testDivisao() {
        assertEquals(5, Divisao.dividir(12, 2));
    }

}
