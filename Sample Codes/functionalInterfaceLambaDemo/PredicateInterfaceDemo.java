package functionalInterfaceLambaDemo;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class PredicateInterfaceDemo {
	public static void main(String args[])
    {
  
        // create a list of strings
        List<String> names = Arrays.asList("Ajay","Avinash","Ravi", "Sachin","Rajesh","Ramesh");
  
        // declare the predicate type as string and use lambda expression to create object
     Predicate<String> p = (s) -> s.startsWith("R");
       
    //  Predicate<String> p = (s) -> s.length()>4;
        // Iterate through the list
        for (String st : names) {
             if (p.test(st))  //Predicate interface returns boolean value
                System.out.println(st); 
       }    
        
     
    }
}
