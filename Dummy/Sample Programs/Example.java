class Example{
   
   Example(){
      System.out.println("Default constructor");
   }
  
   Example(int i, int j){
      System.out.print("parameterized constructor");
      System.out.println(" with Two parameters");
   }
   
   Example(int i, int j, int k){
      System.out.print("parameterized constructor"+i);
      System.out.println(" with Three parameters");
   }
   public static void main(String args[]){
      
      Example obj = new Example();
      
      Example obj2 = new Example(12, 12);
     
      Example obj3 = new Example(1, 2, 13);		
   }
}