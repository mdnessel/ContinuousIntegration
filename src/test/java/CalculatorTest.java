
import org.junit.jupiter.api.*;

class CalculatorTest {

    @Test
    void testAdd(){
        Calculator calc = new Calculator();
        Assertions.assertEquals(4, calc.add(2,2));
    }

    @Test
    void testMultiply(){
        Calculator calc = new Calculator();
        Assertions.assertEquals(9, calc.multiply(3,3));
    }
}
