class Cons {
   /* public Cons() {
        System.out.println("Constructor");
    }*/
 
    public Cons() {
        System.out.println("Not a constructor - just a regular method");
        return ;
    }
 
    public static void main(String[] args) {
        
        Cons obj = new Cons();
 
        
      //  obj.Cons();
    }
}
