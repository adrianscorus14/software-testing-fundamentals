package calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;


import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)

public class CalculatorMockTest {
    Calculator calculator = mock(Calculator.class);


    @Test
    public void test_add() {
        when(calculator.add(eq(1), eq(2))).thenReturn(123);
        when(calculator.add(anyInt(), anyInt())).thenReturn(123);
        verify(calculator).add(anyInt(), anyInt());

    }

}
