//simple peint factorial number
import java.util.*;

public class printfactorial {
    

    public static void calcufact(int n)
    {
        int factorial =1;
        if(n<0)
        {
            
            return;
        }
        else
        {
            for(int i=n;i>1;i--)
            {
                factorial=factorial*i;
                
            }
            System.out.println(factorial);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Factorial Program");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        calcufact(n);
    }
}
