import java.util.*;
public class problem4A {
    public static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args){
        int weight;
        System.out.println("Enter watermelon weight");
        weight = scanner.nextInt();
        Weight weight_check = new Weight();
        boolean w = weight_check.weightcheck(weight);
        if(w)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

class Weight{
    public static Scanner scanner =new Scanner(System.in);
    public  boolean weightcheck( int w){
        if(w<1 || w>100)
        {
            throw new IllegalArgumentException("w (1≤w≤100)");
        }
        if (w%2 == 0 && w>2)
            return true;
        else
            return false;
    }
}
