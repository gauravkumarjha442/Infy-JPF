package functionalInterfaceLambaDemo;

interface A1{  
    public void method();  
}  

          // Without using Lambda Expression 
public class LambdaExpressionDemo1 implements A1 {  
	
	public void method()
    {
    	System.out.println("Method Implemented without Lambda......");
    } 
	
    public static void main(String[] args) {  
      	A1 ob=new LambdaExpressionDemo1();  
        ob.method();  
    }  
}  

         //Without using Lambda Expression (Another Way)
//  public class LambdaExpressionDemo1 {  
//	
//  public static void main(String[] args) {  
//	
//	A1 ob=new A1(){  
//        public void method(){System.out.println("Method Implemented without Lambda...");}  
//    };  
//    
//    ob.method();;    
//  }  
// }  


               //With Lambda Expression (no argument)
//  public class LambdaExpressionDemo1 {  
//
//  public static void main(String[] args) {  
//
//  A1 ob = () ->  System.out.println("Method Implemented using Lambda...");  
//
//  ob.method();;    
//   }  
// }  