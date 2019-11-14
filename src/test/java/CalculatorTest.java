
import org.junit.jupiter.api.*;

class CalculatorTest {

    @Test
    void testAdd(){
        Calculator calc = new Calculator();
        Assertions.assertEquals(4, calc.add(2,2));
    }

    @Test
    void failTest(){
        Calculator calc = new Calculator();
        Assertions.assertEquals(58, calc.add(1,5));
    }

    @Test
    void testMultiply(){
        Calculator calc = new Calculator();
        Assertions.assertEquals(9, calc.multiply(3,3));
    }
}
