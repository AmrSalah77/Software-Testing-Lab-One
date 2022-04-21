import java.util.*;
public class lab1 {
    public static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args){
        int weight;
        System.out.println("enter watermelon weight");
        weight = scanner.nextInt();
        weight = weightcheck(weight);
        if(weight%2==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    static int weightcheck( int w){
        if(w<1 || w>100)
        {
            System.out.println("Enter a valid number");
            w = scanner.nextInt();
            weightcheck(w);
        }
        return w;
    }
}
