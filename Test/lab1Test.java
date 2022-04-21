import org.junit.Test;

import static org.junit.Assert.*;

public class lab1Test {

    @Test
    public void testweightcheck() {
        Weight tester = new Weight();
        assertEquals(false,tester.weightcheck(2));
    }
}