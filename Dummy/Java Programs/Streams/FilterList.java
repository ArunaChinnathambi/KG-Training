import java.util.stream.Stream;
//import java.util.Optional;

class FilterList{

public static void main(String... z){

    Stream.of(1,5,2,9,6,3,1,4,5,7,8,3,1,5,2,6,4,7,9)
        .filter(n -> n % 2 == 1)
        .sorted()
        .forEach(System.out::println);
}
}