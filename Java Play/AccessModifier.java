import java.lang.Class.*;
import java.lang.*;
import java.lang.reflect.*;

 public class AccessModifier {

  static public void main(String[] args) {

      AccessModifier c = new AccessModifier();
      Class cls = c.getClass();
Method[] m = cls.getMethods();
      // returns the Java language modifiers for this class
      int i = cls.getModifiers();
      String retval = Modifier.toString(i);
      System.out.println("Class Modifier = " + retval);
      System.out.println("Class  = " + cls);
      System.out.println("Method  = " + m.toString());
      System.out.println(i);

   }
} 