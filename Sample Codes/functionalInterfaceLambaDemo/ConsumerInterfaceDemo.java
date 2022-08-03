package functionalInterfaceLambaDemo;

import java.util.function.Consumer;

public class ConsumerInterfaceDemo {

//	 static void method(String s){  
//        System.out.println(s.toUpperCase());  
//       }  
	
    public static void main(String[] args) {  
       //  Consumer Interface referring to method  (Without using Lambda Expression)
//        Consumer<String> c = ConsumerInterfaceDemo::method;  
//        c.accept("Sachin");   
//        c.accept("Ramesh"); 
//        c.accept("Ajay");
      
    
      
        
        // Using Lambda Expression  
        Consumer <String> c = (s)->System.out.println(s.toUpperCase());  
        c.accept("Sachin");  
        c.accept("Ramesh"); 
        c.accept("Ajay");
        

    }  
}
