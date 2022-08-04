package annotationDemo;
//@Deprecated
class Demo{  
void method1()
{
	System.out.println("Method 1");
}  
  
@Deprecated
void method2()
{
	System.out.println("Method 2");
}  
}  
	  
class DeprecatedDemo{  
	
public static void main(String args[]){  
  
Demo ob = new Demo();  
ob.method1();
ob.method2();
}
}  