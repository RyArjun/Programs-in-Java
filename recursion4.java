//Fibonacci Series 
public class recursion4 {
    public static void printfib(int a, int b, int n)
    {
        if(n==0)
        {
            System.out.println(" ");
            return ;
            

        }
        int c=a+b;
        System.out.print(c);
        printfib(b, c, n-1);


    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=7;
        System.out.print(a);
        System.out.print(b);
        printfib(a,b,n-2);
    }
}
