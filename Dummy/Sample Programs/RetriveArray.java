import java.util.Scanner;

public class RetriveArray
{
   public static void main(String args[])
   {
       int size, i, ret, count=0;
       int arr[] = new int[50];
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Array Size : ");
       size = scan.nextInt();
	   
       System.out.print("Enter Array Elements : ");
       for(i=0; i<size; i++)
       {
           arr[i] = scan.nextInt();
       }
	   
       System.out.print("Enter Element to be Search : ");
       ret = scan.nextInt();
       for(i=0; i<size; i++)
       {
           if(arr[i] == ret)
           {
               System.out.println("Element is Present");
               
           }

           
       }
      
       

       }
   }
