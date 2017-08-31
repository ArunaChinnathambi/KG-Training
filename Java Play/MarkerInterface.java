public interface MarkerInterface{

public class Greeting  implements MarkerInterface{
    void say(){
        System.out.println("Hello World");
    }
}
}


 class Greet {

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        if (greeting instanceof MarkerInterface) {
            greeting.say();
        } else {
            System.out.println("You don't have permission to use say greeting");
        }
    }
}
