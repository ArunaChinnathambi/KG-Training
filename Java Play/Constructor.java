public class Constructor{
 int value=24;

   private  Constructor(){
       

System.out.println("Haii"+ value);
   display();
     } 
    
public void display(){
 
        System.out.println("Funnyy"+value);

}
    
public static void main(String... z){


    Constructor obj = new Constructor();
    //obj.display();
    System.out.println("hello");
}
    

}
