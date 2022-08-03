package functionalInterfaceLambaDemo;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;  

public class FunctionInterfaceDemo {  
	
//    static String method(String s){  
//        return s.toUpperCase();  
//    }  
    
    public static void main(String[] args) {  
    	
        // Function interface referring to a method  (Without using Lambda Expression)
//        Function<String, String> f = FunctionInterfaceDemo::method;  
//        System.out.println(f.apply("java programming"));  
        
   
     // Using Lambda Expression 
     Function<String, String> f = (s)->s.toUpperCase(); 
    Function<String, Integer> f2 = (s)->s.length(); 
   //  UnaryOperator<String> f1 =(s)->s.toUpperCase();
     
    //	Function<String, Integer> f = (s)->s.length(); 
    //  f=f.andThen(s->s.concat(" language"));   // andThen() is also applied here: First uppercase operation and then concatenate
    //  f=f.compose(s->s.concat(" language"));     //compose() is also applied here : First concatenate and then uppercase operation
      System.out.println(f.apply("java programming")); 
      System.out.println(f2.apply("java programming"));  
      // Demo for BinaryOperator
        BinaryOperator <String> b =(s1,s2)->s1.concat(s2);
        System.out.println(b.apply("Sachin","Tendulkar"));

    }  
}  