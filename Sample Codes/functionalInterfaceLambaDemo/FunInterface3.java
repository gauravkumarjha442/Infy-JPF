package functionalInterfaceLambaDemo;

interface A{  
    default void method1()
    {  
        System.out.println("Method1");  
    }  
    
   // void method3(); //If method3() exists, interface A will not be extended to B, 
                      // because, B can have only one abstract method
}  

@FunctionalInterface  
interface B extends A{  
    void method2();   // abstract method  
}  

public class FunInterface3 {  
//    public void method2(){  
//        System.out.println("Method2");  
//    }  
	
   
	public static void main(String[] args) {  
    	//FunInterface3 ob = new FunInterface3();  // Without using Lambda Expression
       // ob.method1();
       // ob.method2();
        
		B b = ()->System.out.println("Method2");  // Using Lambda Expression
		B x = ()->System.out.println("XYZ");  // Using Lambda Expression
        b.method1();
        b.method2();
        
        x.method2();
     }  
}  
