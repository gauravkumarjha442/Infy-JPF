package cloneDemo;

class Test1 {
    int x, y;
}

class Test2 implements Cloneable {
    int a;
    int b;
    Test1 c = new Test1();
    
      // clone() method for shallow copy
//    public Object clone() throws CloneNotSupportedException
//    {
//        return super.clone();
//    }
    
    
         // clone() method for deep copy
    public Object clone() throws CloneNotSupportedException
    {
        // Assign the shallow copy to new reference variable t
        Test2 t = (Test2)super.clone();
        
     // Creating a deep copy for c
        t.c = new Test1();
        t.c.x = c.x;
        t.c.y = c.y;
        
        // Create a new object for the field c and assign it to shallow copy obtained,
        // to make it a deep copy
        return t;
    }
    
}

public class ShallowDeepCopyDemo {
	
	public static void main(String args[]) throws CloneNotSupportedException
	    {
	        Test2 t1 = new Test2();
	        t1.a = 10;
	        t1.b = 20;
	        t1.c.x = 30;
	        t1.c.y = 40;
	 
	        Test2 t2 = (Test2)t1.clone(); // Creating a clone (copy) of object t1 
	        
	        System.out.println("Before modification:");
	        System.out.println("Object t1 : " +t1.a + " " + t1.b + " " + t1.c.x + " " + t1.c.y);
		    System.out.println("Object t2 : " +t2.a + " " + t2.b + " " + t2.c.x + " " + t2.c.y);
	 
	       t2.a = 100;// Change in the primitive type field
	 
	       t2.c.x = 300; // Change in the object type field 
	     
	       System.out.println("\nAfter modification:");
	       System.out.println("Object t1 : " +t1.a + " " + t1.b + " " + t1.c.x + " " + t1.c.y);
		   System.out.println("Object t2 : " +t2.a + " " + t2.b + " " + t2.c.x + " " + t2.c.y);
	    }

}
