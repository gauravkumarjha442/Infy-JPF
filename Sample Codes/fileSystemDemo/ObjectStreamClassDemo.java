package fileSystemDemo;

import java.io.ObjectStreamClass;

public class ObjectStreamClassDemo {
	public static void main(String[] args) {  
		  
        // create a new object stream class for Integers  
        ObjectStreamClass osc = ObjectStreamClass.lookup(SmartPhone.class);  
  
        // get the value field from ObjectStreamClass for integers  
        System.out.println("" + osc.getField("price"));  

        // create a new object stream class for String  
       ObjectStreamClass osc2 = ObjectStreamClass.lookup(String.class);  
  
        // get the Class instance for osc2  
       System.out.println("" + osc2.getField("hash"));  
  
    }  
}
