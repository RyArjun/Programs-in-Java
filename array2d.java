//take an 2D Array as input and output
import java.util.Scanner;
public class array2d {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] numbers=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                numbers[i][j]=sc.nextInt();
            }
        }
         
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                    System.out.print(numbers[i][j]+" ");
                }
                System.out.println();
            }
 
       
        System.out.println("Array created!");
        int x=sc.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if (numbers[i][j]==x)
                {
                    System.out.println("Element present at "+i+" "+j);
                }
            }
        }

    }
}
