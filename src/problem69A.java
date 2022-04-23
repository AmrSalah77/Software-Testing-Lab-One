import java.util.*;
public class problem69A {
    public static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args){
        int number;
        System.out.println("Enter number:");
        number = scanner.nextInt();
        int[] coordinate =new int[number*3];
        System.out.println("Enter coordinates:");
            for(int i=0; i< coordinate.length; i++){
                coordinate[i] = scanner.nextInt();
        }
        equilibrium equilibrium = new equilibrium();
        boolean eq = equilibrium.equilibriumcheck(number,coordinate);
        if(eq)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

class equilibrium{
    public  boolean equilibriumcheck( int n, int[] array) {
        int sum = 0;
        if (n < 1 || n > 100)
            throw new IllegalArgumentException("n (1≤n≤100)");

        for (int i = 0; i < array.length; i++){
            if (array[i] < -100 || array[i] > 100)
                throw new IllegalArgumentException("-100≤x,y,z≤100");
        }
        for (int j = 0; j < 3; j++) {
            sum = 0;
            for (int i = j; i < array.length; i+=3) {
                sum += array[i];
            }
            if (sum != 0) {
                return false;
            }
        }
        return true;
    }
}

