import static org.junit.Assert.*;

public class CalculatorTest {

    @org.junit.Test
    public void add(){
        assertEquals(Calculator.add(1,2), 3);
    }

}