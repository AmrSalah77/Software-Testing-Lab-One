import org.junit.Test;

import static org.junit.Assert.*;

public class problem69ATest {

    @Test
    public void Test1() {
        int[] arr = {1,2,3};
        equilibrium tester = new equilibrium();
        assertFalse(tester.equilibriumcheck(1,arr));
    }

    @Test
    public void Test2() {
        int[] arr = {4,7,9,8,2,5};
        equilibrium tester = new equilibrium();
        assertFalse(tester.equilibriumcheck(2,arr));
    }

    @Test
    public void Test3() {
        int[] arr = {3, -1, 7, -5, 2, -4, 2, -1, -3};
        equilibrium tester = new equilibrium();
        assertTrue(tester.equilibriumcheck(3,arr));
    }

    @Test
    public void Test4() {
        int[] arr = {0, 2, -2, 1, -1, 3, -3, 0, 0};
        equilibrium tester = new equilibrium();
        assertFalse(tester.equilibriumcheck(3,arr));
    }

}