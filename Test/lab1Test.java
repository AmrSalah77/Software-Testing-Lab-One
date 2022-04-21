import org.junit.Test;

import static org.junit.Assert.*;

public class lab1Test {

    //branch coverage
    @Test
    public void testweight() {
        Weight tester = new Weight();
        assertEquals(false,tester.weightcheck(2));
        assertEquals(true,tester.weightcheck(4));
    }


    //testing boundaries
    @Test(expected = IllegalArgumentException.class)
            public void testExceptionIsThrown(){
        Weight tester = new Weight();
        tester.weightcheck(0);
        tester.weightcheck(101);
    }
    @Test
    public void testweightcheck() {
        Weight tester = new Weight();
        assertEquals(false,tester.weightcheck(1));
        assertEquals(false,tester.weightcheck(2));
        assertEquals(false,tester.weightcheck(99));
        assertEquals(true,tester.weightcheck(100));
    }

}