import java.util.*;

public class Test {

  public static void main(String[] args) throws Exception {
    List<Person> persons =
        Arrays.asList(
            new Person("Max", 18),
            new Person("Peter", 23),
            new Person("Pamela", 23),
            new Person("David", 12));   

    Integer ageSum = persons
        .parallelStream()
        .reduce(0,
            (sum, p) -> {
                System.out.format("accumulator: sum=%s; person=%s; thread=%s\n",
                    sum, p, Thread.currentThread().getName());
                return sum += p.age;
            },
            (sum1, sum2) -> {
                System.out.format("combiner: sum1=%s; sum2=%s; thread=%s\n",
                    sum1, sum2, Thread.currentThread().getName());
                return sum1 + sum2;
            });

    System.out.println(ageSum);
  }

}
class Person {
  String name;
  int age;

  Person(String name, int age) {
      this.name = name;
      this.age = age;
  }

  @Override
  public String toString() {
      return name;
  }
}