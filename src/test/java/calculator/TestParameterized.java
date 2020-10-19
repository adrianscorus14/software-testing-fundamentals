package calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestParameterized {
    @Parameterized.Parameters
    public static Collection<Integer[]> parameters() {
        return Arrays.asList(new Integer[][] {
                {1, 1, 2},
                {2, 4, 6},
                {1, 6, 7},
                {4, 1, 5}
        });
    }
    @Parameter(0)
    public int a;

    @Parameter(1)
    public int b;

    @Parameter(2)
    public int expectedResult;

    @Test
    public void testAdd(){
        Calculator calculator=new Calculator();
        int actualResult=calculator.add(a,b);
        assertEquals(expectedResult,actualResult);

    }



}
