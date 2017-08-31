class Ssplit{
    public static void main(String arg[])
    {
String string = "Hello World This is a sample file.";
String[] strings = string.split(" ");
int[] counts = new int[30]; 
for(String str : strings)
     if(str.length() < counts.length)
     counts[str.length()] += 1;
for(int i = 1; i < counts.length; i++)
    System.out.println(i + " letter words: " + counts[i]);
}
}