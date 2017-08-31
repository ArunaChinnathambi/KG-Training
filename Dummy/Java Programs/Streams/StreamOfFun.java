import java.util.stream.Stream;

class StreamOfFun{
    public static void main(String... z){
        //List<String> st= Arrays.asList("aa","ab","ac","fdh","jd");

       Stream.of("aa","ab","ac","fdh","jd")// No Creation of Array List 
            .findFirst()
            .ifPresent(System.out::println);
    }
}