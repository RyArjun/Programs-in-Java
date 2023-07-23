//Generate username from email , input by user
import java.util.Scanner;

public class usernamestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String email=sc.nextLine();
        System.out.println(email);
        String sub="";
        for(int i=0;i<email.length();i++)
        {
            if(email.charAt(i) == '@')
            {
                
                break;
            }
            else
            {
                 sub+=email.charAt(i);
            }
        }
        System.out.println("Username = "+sub);
        

    }
}

           
        
        
   

