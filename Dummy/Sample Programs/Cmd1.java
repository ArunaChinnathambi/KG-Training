public class Cmd1 {

    private String k;

   /*
    public Cmd1() {
        super();
        
    }*/

    public void set(String a, String b, String c) {
         k = a + " " + b + " " + c; 
    }

    public void run() {
        System.out.println(k);
    }

    public static void main(String[] args) {
        String l = args[0];
        String m = args[1];
        String n = args[2];
        Cmd1 obj = new Cmd1();
        obj.set(l, m, n);
        obj.run();
    }
}