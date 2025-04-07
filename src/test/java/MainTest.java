import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testFibonacciZero() {
        assertEquals(0, Main.fibonacci(0));
    }

    @Test
    public void testFibonacciOne() {
        assertEquals(1, Main.fibonacci(1));
    }

    @Test
    public void testFibonacciTwo() {
        assertEquals(1, Main.fibonacci(2));
    }

    @Test
    public void testFibonacciThree() {
        assertEquals(2, Main.fibonacci(3));
    }

    @Test
    public void testFibonacciTen() {
        assertEquals(55, Main.fibonacci(10));
    }

    @Test
    public void testFibonacciFifteen() {
        assertEquals(610, Main.fibonacci(15));
    }
}