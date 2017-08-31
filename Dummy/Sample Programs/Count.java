import java.util.Scanner;

public class Count
{
    public static int countWords(String[] str)
    {
       int count=str.length;
      /*  for (int i=0;i<=str.length-1;i++)
        {
            if (str.charAt(i) == ' ' && str.charAt(i+1)!=' ')
            {
                count++;
            }
        }*/
        return count;

    }
  
    
    public static void main(String[] args)
    {
        String[] a={"hai","bai","baskar"};
      //  Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
       // String sentence = in.nextLine()
       // System.out.println(sentence);
       System.out.print("Your sentence has " + countWords(a) + " words.");
    }
    
}