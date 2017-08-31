//package com.tutorialspoint;
import java.lang.Class.*;
import java.lang.*;
import java.lang.reflect.Modifier;

public class FindAccessModifier {

   public static void main(String[] args) {

      FindAccessModifier c = new FindAccessModifier();
      Class cls = c.getClass();

      // returns the Java language modifiers for this class
      int i = cls.getModifiers();
      String retval = Modifier.toString(i);
      System.out.println("Class Modifier = " + retval);
      System.out.println("Class  = " + cls);
   }
} 