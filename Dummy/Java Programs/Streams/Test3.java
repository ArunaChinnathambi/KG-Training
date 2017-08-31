
package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import main.CreateHighOrderFunction;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HighOrderFunctionTest {

  @BeforeClass public static void setUp(){

    CreateHighOrderFunction createHighOrderFunction =
        new CreateHighOrderFunction(Arrays.asList(1, 2, 3, 4, 5, 6));
  }

  @Test public void testFindEvenNumbers() {

    Predicate integerPredicate = element -> element % 2 == 0;

    List expectedList = new ArrayList();

    expectedList.add(2);
    expectedList.add(4);
    expectedList.add(6);

    List actualList = CreateHighOrderFunction.findEvenNumbers(integerPredicate);

    assertThat(expectedList, is(equalTo(actualList)));

  }

}
public class Test3 {

  private static List list;

  private static List result = new ArrayList();

  public Test3(List list) {

    Test3.list = list;

  }

  public static List findEvenNumbers(Predicate predicateToApply) {

    BiFunction<List, Predicate, List> filter;
    
    filter = (listOfIntegers, predicate) -> {

      result.addAll(list.stream().filter(predicate).collect(Collectors.toList()));
      return result;

    };
   
    filter.apply(list, predicateToApply);
    return result;

  }
}