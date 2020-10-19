package calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class CalculatorTest2 {
    @Parameterized.Parameters
    public static Collection<Integer[]> parameters() {
        return Arrays.asList(new Integer[][]{
                {1, 1, 1},
                {2, 4, 16},
                {1, 6, 1},
                {-4, -2, 16}
        });
    }

    @Parameter(0)
    public int a;

    @Parameter(1)
    public int b;

    @Parameter(2)
    public int expectedResult;


    @Test
    public void testPowerOfN() {
        Calculator calculator = new Calculator();
        int actualresult = calculator.powerOfN(a, b);
        assertEquals(expectedResult, actualresult);

    }
}

