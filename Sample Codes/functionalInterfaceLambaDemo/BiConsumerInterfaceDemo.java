package functionalInterfaceLambaDemo;

import java.util.function.BiConsumer;  

public class BiConsumerInterfaceDemo {  
    
//	static void ShowDetails(String name, Integer age){  
//        System.out.println(name+" "+age);  
//    }  
	
    public static void main(String[] args) {  
        // Referring method  (Without using Lambda Expression)
//        BiConsumer<String, Integer> b = BiConsumerInterfaceDemo::ShowDetails;  
//        b.accept("Sachin", 10);  
//        b.accept("Ramesh", 20); 
//        b.accept("Ajay", 30);
        
        // Using Lambda Expression  
        BiConsumer<String, Integer> b = (name, age)->System.out.println(name+" "+age);  
        b.accept("Sachin", 10);  
        b.accept("Ramesh", 20); 
        b.accept("Ajay", 30);
    }  
}
