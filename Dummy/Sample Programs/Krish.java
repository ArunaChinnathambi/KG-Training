import java.util.Scanner;
class Krish
{
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        
        String[] a=str.split("");
        int[] count=new int[5];
        
       for(String b:a)
        {
            if(b.length()<count.length)
            {
                count[b.length()]=count[b.length()]+1;
            }    }
         for(int i = 1; i < count.length; i++)
         
    System.out.println(i + " letter words: " + count[i]);
        
    }  
}
