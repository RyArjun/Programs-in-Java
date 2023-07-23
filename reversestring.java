//Reverse a string

public class reversestring
{
public static void main(String[] args) 
{
    String s="vyoma";
    String rev="";
    int l=s.length();
    System.out.println(l);
    for(int i=l-1;i>=0;i--)
    {
       rev+=s.charAt(i);
    }
    System.out.println(rev);

}
}