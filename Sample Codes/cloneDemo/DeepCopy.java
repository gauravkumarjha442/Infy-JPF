package cloneDemo;

class Test3 {
    int x, y;
}
 
// Contains a reference of Test3 and implements clone with deep copy.
class Test4 implements Cloneable {
	int a;
    int b;
 
    Test3 c = new Test3();
 
    public Object clone() throws CloneNotSupportedException
    {
        // Assign the shallow copy to new reference variable t
        Test4 t = (Test4)super.clone();
        
     // Creating a deep copy for c
        t.c = new Test3();
        t.c.x = c.x;
        t.c.y = c.y;
        
        // Create a new object for the field c and assign it to shallow copy obtained,
        // to make it a deep copy
        return t;
    }
}
 
public class DeepCopy {
    public static void main(String args[])
        throws CloneNotSupportedException
    {
        Test4 t1 = new Test4();
        t1.a = 10;
        t1.b = 20;
        t1.c.x = 30;
        t1.c.y = 40;
 
        Test4 t2 = (Test4)t1.clone();
        
        System.out.println("Before modification:");
        System.out.println("Object t1 : " +t1.a + " " + t1.b + " " + t1.c.x + " " + t1.c.y);
	    System.out.println("Object t2 : " +t2.a + " " + t2.b + " " + t2.c.x + " " + t2.c.y);
	    
        t2.a = 100;// Change in primitive type of t2 will not be reflected in t1 field
 
        t2.c.x = 300;// Change in object type field of t2 will not be reflected in t1(deep copy)
     
        System.out.println("\nAfter modification:");
	    System.out.println("Object t1 : " +t1.a + " " + t1.b + " " + t1.c.x + " " + t1.c.y);
	    System.out.println("Object t2 : " +t2.a + " " + t2.b + " " + t2.c.x + " " + t2.c.y);
    }
}