//factorial using recursion
public class recursion3 {
public static int calfact(int n){
if(n==1 || n==0)
{
    return 1;
}
int f=calfact(n-1);
int fact=f*n;
return fact;
}
public static void main(String[] args) {
    int n=5;
    int ans=calfact(n);
    System.out.println(ans);
}
    
    
}


 
