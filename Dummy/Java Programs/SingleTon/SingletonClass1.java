public class S1 {
     
    private static Si1 myObj;
    /**
     * Create private constructor
     */
    private SingletonClass1(){
         
    }
    /**
     * Create a static method to get instance.
     */
    public static SingletonClass1 getInstance(){
        if(myObj == null){
            myObj = new SingletonClass1();
            
        }
        System.out.println(myObj);
        return myObj;
        
    }
     
    public void getSomeThing(){
        // do something here
        System.out.println("I am here....");
    }
     SingletonClass1
    public static void main(String a[]){
        SingletonClass1 st = SingletonClass1.getInstance();
        st.getSomeThing();
    }
}