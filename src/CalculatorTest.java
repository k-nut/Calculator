import static org.junit.Assert.*;

public class CalculatorTest {

    @org.junit.Test
    public void add(){
        assertEquals(Calculator.add(1,2), 3);
    }

    @org.junit.Test
    public void subtract(){
        assertEquals(Calculator.subtract(2,1), 1);
    }

    @org.junit.Test
     public void addBigNumbers(){
        assertEquals(Calculator.add(1_000_000,2_000_000), 3_000_000);
    }

}