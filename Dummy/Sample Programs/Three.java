import java.util.Scanner;

public class Three
{
   public static void main(String args[])
   {
      int arr[][][] = new int[10][10][3];
      int i, j, k, num=1;
	  
      for(i=0; i<10; i++)
      {
          for(j=0; j<10; j++)
          {
              for(k=0; k<3; k++)
              {
                  arr[i][j][k] = num;
                  num++;
              }
          }
      }
	  
       for(i=0; i<3; i++)
      {
          for(j=0; j<4; j++)
          {
              for(k=0; k<2; k++)
              {
                  System.out.print("arr[" +i+ "][" +j+ "][" +k+ "] = " +arr[i][j][k]+ "\t");
              }
              System.out.println();
          }
          System.out.println();
      }
   }
}