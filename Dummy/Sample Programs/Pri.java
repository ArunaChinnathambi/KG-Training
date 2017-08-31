class Test1
{
    public static void main(String args[]) 
    { 
        byte b; 
        int i = 257; 
        double d = 323.142;
        System.out.println("Conversion of int to byte."); 
         
        //i%256
        b = (byte) i; 
        System.out.println("i = b " + i + " b = " + b);
        System.out.println("\nConversion of double to byte.");
         
        //d%256
        b = (byte) d; 
        System.out.println("d = " + d + " b= " + b);
    }
}