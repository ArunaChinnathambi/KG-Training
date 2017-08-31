public class SingletonClass {
     
    private static SingletonClass myObj;
    /**
     * Create private constructor
     */
    private SingletonClass(){
         
    }
    /**
     * Create a static method to get instance.
     */
    public static SingletonClass getInstance(){
        if(myObj == null){
            myObj = new SingletonClass();
            
        }
        System.out.println(myObj);
        return myObj;
        
    }
     
    public void getSomeThing(){
        // do something here
        System.out.println("I am here....");
    }
     
    public static void main(String a[]){
        SingletonClass st = SingletonClass.getInstance();
        st.getSomeThing();
    }
}