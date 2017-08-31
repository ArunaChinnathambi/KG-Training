import java.util.Scanner;

public class Tras
{
   public static void main(String args[])
   {
       int i, j;
       int arr[][] = new int[3][3];
       int arrt[][] = new int[3][3];
       Scanner scan = new Scanner(System.in);
	   
       
       for(i=0; i<3; i++)
       {
           for(j=0; j<3; j++)
           {
               arr[i][j] = scan.nextInt();
           }
       }
	   
      
       for(i=0; i<3; i++)
       {
           for(j=0; j<3; j++)
           {
               arrt[i][j] = arr[j][i];
           }
       }
	   
       System.out.println("transport");
       for(i=0; i<3; i++)
       {
           for(j=0; j<3; j++)
           {
               System.out.print(arrt[i][j]+ " ");
           }
           System.out.println();
       }
   }
}