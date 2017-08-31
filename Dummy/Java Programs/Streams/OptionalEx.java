import java.util.Optional;

public class OptionalEx {
  
  public static void main(String... z) {
    
    Optional<String> empty  = Optional.empty();
    
    System.out.println(empty);

    Optional<String> str = Optional.of("HAI");
    
    System.out.println(str);

    String nullableString = "WELCOME"; 
    Optional<String> str2  = Optional.of(nullableString);
    
    System.out.println(str2);

    String nullable = "         "; 
    Optional<String> str3  = Optional.of(nullable);
    
    System.out.println(str3);
  }
}