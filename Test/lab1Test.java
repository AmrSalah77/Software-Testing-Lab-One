import org.junit.Test;

import static org.junit.Assert.*;

public class lab1Test {

    @Test
    public void testweightcheck() {
        lab1 tester = new lab1();
        assertEquals(false,tester.weightcheck(2));
    }
}