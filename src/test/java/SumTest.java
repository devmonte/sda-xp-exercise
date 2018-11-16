import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SumTest {
    Calculator calculator;

    @BeforeEach
    public void start() {
        calculator = new Calculator();
    }
@DisplayName("method sum should return a proper value")
@Test
    public void test1() {
        Double a = 1.2;
        Double b = 1.0;
        Double sum = calculator.sum(a, b);
        assertEquals(sum, 2.2, 0.0000000001);
    }

}
