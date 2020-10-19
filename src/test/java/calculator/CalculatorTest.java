package calculator;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CalculatorTest {
    private Calculator calculator=new Calculator();
    @BeforeClass
    public static void setup(){
        System.out.println("Before each class");
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("After each class");
    }
    @Test
    public void test_add(){
        //given

        //when
        int result=calculator.add(4,4);
        //then
        //assert result==8;
        assertEquals(8,result);
        int result2=calculator.add(-1,-3);
        assertNotNull(result2);







    }
    @Test
    public void test_divide_success(){
        //given

        //when
        int result=calculator.divide(4,4);
        int result2=calculator.divide(4,4);
        //then
        assertNotNull(result);
        assertEquals("divide operation dont work as expected",1,result);
        assertNotNull(result2);


    }
    @Test (expected=ArithmeticException.class)
    public void test_divide_throws_exception(){

        int result=calculator.divide(4,0);
        assertNotNull(result);

    }
    @Test
    public void test_multiplyBy100(){

        int result =calculator.multiplyBy100(37);
        int result2=calculator.multiplyBy100(0);
        assertNotNull(result2);
        assertEquals(3700,result);
    }
    @Test
    public void test_powerOfN(){

        int result=calculator.powerOfN(2,3);
        assertEquals(8,result);
    }
}
