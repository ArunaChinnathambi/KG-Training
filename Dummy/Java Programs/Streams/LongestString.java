import java.util.stream.Stream;
import java.util.function.Function;
import java.util.Optional;

class LongestString{
    public static void main(String... z){

      Stream.of("shm","iued","uydevf","shd","sghd")
            .reduce((a,b) -> a.length() >= b.length() ? a:b)
            .findFirst()
            .ifPresent(System.out::println);
    }
}