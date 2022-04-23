import java.util.*;
public class problem69A {
    public static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args){
        int number;
        number = scanner.nextInt();
        int[] cor =new int[number*3];
            for(int i=0; i< cor.length; i++){
                cor[i] = scanner.nextInt();
        }
        equilibrium equilibrium = new equilibrium();
        boolean w = equilibrium.equilibriumcheck(number,cor);
        if(w)
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

        for (int i = 0; i < array.length; i++) {
            if (array[i] < -100 || array[i] > 100)
                throw new IllegalArgumentException("-100≤x,y,z≤100");
            sum += array[i];
        }
        if(sum==0)
            return true;
        return false;
    }
}

