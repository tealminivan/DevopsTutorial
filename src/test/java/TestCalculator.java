import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator{

    @Test
    public void testAddition(){
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(7, 3));
        assertEquals(126, calculator.add(68,58));
        assertEquals(1023, calculator.add(767, 256));
        assertEquals(5, calculator.add(0, 5));
        assertEquals(11, calculator.add(3, 8));
    }

    @Test
    public void testSubtraction(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(10, 8));
        assertEquals(58, calculator.subtract(126, 68));
        assertEquals(256, calculator.subtract(1023, 767));
        assertEquals(5, calculator.subtract(5, 0));
        assertEquals(3, calculator.subtract(11, 8));
    }

    @Test
    public void testDivision(){
        Calculator calculator = new Calculator();
        assertEquals(4.5, calculator.divide(9, 2));
        assertEquals(42, calculator.divide(126, 3));
        assertEquals(0, calculator.divide(0, 767));
        assertEquals(30.75, calculator.divide(123, 4));
        assertEquals(5.5, calculator.divide(11, 2));
    }

    @Test
    public void testMultiplication(){
        Calculator calculator = new Calculator();
        assertEquals(9, calculator.multiply(4.5, 2));
        assertEquals(126, calculator.multiply(42, 3));
        assertEquals(0, calculator.multiply(0, 767));
        assertEquals(123, calculator.multiply(30.75, 4));
        assertEquals(11, calculator.multiply(5.5, 2));
    }

    @Test
    public void testSquareRoot(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.squareRoot(9));
        assertEquals(4, calculator.squareRoot(16));
        assertEquals(5, calculator.squareRoot(25));
        assertEquals(11, calculator.squareRoot(121));
        assertEquals(12, calculator.squareRoot(144));
    }

    @Test 
    public void testPower(){
        Calculator calculator = new Calculator();
        assertEquals(9, calculator.power(3, 2));
        assertEquals(64, calculator.power(4,3));
        assertEquals(625, calculator.power(5, 4));
        assertEquals(121, calculator.power(11, 2));
        assertEquals(1728, calculator.power(12, 3));
    }


}