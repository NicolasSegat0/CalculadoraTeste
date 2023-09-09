package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import main.Soma;

public class TestSoma {
	public void testSoma() {
        assertEquals(5, Soma.somar(2, 3));
    }

}
