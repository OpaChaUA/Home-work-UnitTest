import com.goit.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumCalculatorTest {
    private SumCalculator sumCalculator;
    @BeforeEach
        void beforeEach(){
        sumCalculator = new SumCalculator();
    }
    @Test
    void nEqualsOne(){
        int actual = sumCalculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void nEqualsThree(){
        assertEquals(6, sumCalculator.sum(3));
    }
    @Test
    void nEqualsZero(){
        assertThrows(IllegalArgumentException.class, ()->sumCalculator.sum(0));
    }


}
