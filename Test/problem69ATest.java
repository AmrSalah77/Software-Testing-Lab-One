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

    @Test
    public void Test5() {
        int[] arr = {-86, 10, -80, 98, 46, -52, 30, -22, 100, 37, -38, 56, 86, 50, 64, 51, 4, 77, 25, 19,
                61, -69, -88, -97, 33, -60, -45, -16, 89, 16};
        equilibrium tester = new equilibrium();
        assertFalse(tester.equilibriumcheck(10,arr));
    }

    @Test
    public void Test6() {
        int[] arr = {3, 28, -35, -32, -44, -17,9, -25, -6,-42, -22, 20,-19, 15, 38,-21, 38, 48,-1,
                -37, -28,-10, -13, -50,-5, 21, 29,34, 28, 50,50, 11, -49,34, 0, 0};
        equilibrium tester = new equilibrium();
        assertTrue(tester.equilibriumcheck(12,arr));
    }

    @Test
    public void Test7() {
        int[] arr = {-64, -79, 26,-22, 59, 93,-5, 39, -12,77, -9, 76,55, -86, 57,83, 100, -97,-70, 94,
                84,-14, 46, -94,26, 72, 35,14, 78, -62,17, 82, 92,-57, 11, 91,23, 15, 92,-80, -1, 1,12,
                39, 18,-23, -99, -75,-34, 50, 19,-39, 84, -7,45, -30, -39,-60, 49, 37,45, - 16, -72,33,
                -51, -56,-48, 28, 5,97, 91, 88,45, -82, -11,-21, -15, -90,-53, 73, -26,-74, 85, -90,-40,
                23, 38,100, -13, 49,32, -100, -100,0, -100, -70, 0, -100, 0,0, -100, 0,0, -100, 0,0, -100, 0,0, -37, 0};
        equilibrium tester = new equilibrium();
        assertTrue(tester.equilibriumcheck(37,arr));
    }


    @Test(expected = IllegalArgumentException.class)
    public void nSmallerthanOne(){
        int [] arr ={1,2,3};
        equilibrium tester = new equilibrium();
        tester.equilibriumcheck(0,arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nGreaterthanHundred(){
        int [] arr ={1,2,3};
        equilibrium tester = new equilibrium();
        tester.equilibriumcheck(101,arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void coordinateSmallerthanNegativeHundred(){
        int [] arr ={-1,100,-101};
        equilibrium tester = new equilibrium();
        tester.equilibriumcheck(1,arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void coordinateGreaterthanHundred(){
        int [] arr ={1,-100,101};
        equilibrium tester = new equilibrium();
        tester.equilibriumcheck(1,arr);
    }
}