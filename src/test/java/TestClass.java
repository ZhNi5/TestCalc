import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClass {
    @Test
    public void testSumPositive(){
        Calc calc= new Calc();
        int actualSum = calc.sum(1,2);
        Assertions.assertEquals(3,actualSum);
    }
    @Test
    public void testDivisionPositive(){
        Calc calc= new Calc();
        int actualSum = calc.division(4,2);
        Assertions.assertEquals(2,actualSum);
    }
    @Test
    public void testDivisionNull(){
        Calc calc= new Calc();
        int actualSum = calc.division(4,0);
        Assertions.assertEquals(123,actualSum);
    }
    @Test
    public void testMultiplicationPositive(){
        Calc calc= new Calc();
        int actualSum = calc.multiplication(4,2);
        Assertions.assertEquals(8,actualSum);
    }

    @Test
    public void testSubtractionPositive(){
        Calc calc= new Calc();
        int actualSum = calc.subtraction(4,2);
        Assertions.assertEquals(2,actualSum);
    }
}
