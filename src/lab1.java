import java.util.*;
public class lab1 {
    public static Scanner scanner =new Scanner(System.in);
    public  void main(String[] args){
        int weight;
        System.out.println("enter watermelon weight");
        weight = scanner.nextInt();
        boolean w = weightcheck(weight);
        if(w)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public  boolean weightcheck( int w){
        if(w<1 || w>100)
        {
            System.out.println("Enter a valid number");
            w = scanner.nextInt();
            weightcheck(w);
        }
        if (w%2 == 0 && w>2)
            return true;
        else
            return false;
    }
}
