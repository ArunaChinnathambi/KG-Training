import java.util.*;

class Fun{
    public static void main(String... z){
        List<String> fu = Arrays.asList("ag","gd","abn","hfu","ah");

       // List<Integer> fu = Arrays.asList(15,26,42,13,18,24,18);
        fu
            .stream()
            .filter(a -> a.startsWith("a"))
            .sorted()
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}