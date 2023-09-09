package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import main.Subtracao;

public class TestSubtracao {
	public void testSubtracao() {
        assertEquals(5, Subtracao.subtrair(5, 3));
    }

}
