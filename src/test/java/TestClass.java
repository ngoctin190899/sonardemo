import org.junit.Test;
import static org.junit.Assert.*;

public class TestClass {

    Calculation calculation = new Calculation();

    @Test
    public void twoPlusTwoEqualsFour(){
        assertEquals(4,calculation.adder(2,2));
    }

}
