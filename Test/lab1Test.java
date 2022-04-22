import org.junit.Test;

import static org.junit.Assert.*;

public class lab1Test {

    @Test
    public void testweight() {
        Weight tester = new Weight();
        assertFalse(tester.weightcheck(2));
    }

    @Test
    public void testweight1() {
        Weight tester = new Weight();
        assertTrue(tester.weightcheck(50));
    }

    @Test
    public void testweight2() {
        Weight tester = new Weight();
        assertTrue(tester.weightcheck(4));
    }

    @Test
    public void testweight3() {
        Weight tester = new Weight();
        assertFalse(tester.weightcheck(1));
    }


    @Test(expected = IllegalArgumentException.class)
            public void testExceptionIsThrown(){
        Weight tester = new Weight();
        tester.weightcheck(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionIsThrown1(){
        Weight tester = new Weight();
        tester.weightcheck(101);
    }

}