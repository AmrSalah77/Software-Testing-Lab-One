import org.junit.Test;

import static org.junit.Assert.*;

public class problem4ATest {

    @Test
    public void testweight() {
        Weight tester = new Weight();
        assertFalse(tester.weightcheck(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionIsThrown(){
        Weight tester = new Weight();
        tester.weightcheck(0);
    }

    @Test
    public void testweight1() {
        Weight tester = new Weight();
        assertFalse(tester.weightcheck(1));
    }

    @Test
    public void testweight2() {
        Weight tester = new Weight();
        assertTrue(tester.weightcheck(8));
    }

    @Test
    public void testweight3() {
        Weight tester = new Weight();
        assertTrue(tester.weightcheck(50));
    }


    @Test
    public void testweight4() {
        Weight tester = new Weight();
        assertFalse(tester.weightcheck(67));
    }

    @Test
    public void testweight5() {
        Weight tester = new Weight();
        assertFalse(tester.weightcheck(99));
    }

    @Test
    public void testweight6() {
        Weight tester = new Weight();
        assertTrue(tester.weightcheck(100));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionIsThrown1(){
        Weight tester = new Weight();
        tester.weightcheck(101);
    }

}