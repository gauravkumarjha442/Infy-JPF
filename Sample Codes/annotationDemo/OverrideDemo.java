package annotationDemo;

interface A{  
void method1();  
void method2();  
}



public class OverrideDemo implements A{
	@Override
	public void method1()
	{
		System.out.println("Method1");
	}
	
	@Override
	public void method2() 
	{
		System.out.println("Method 2");
	}
	
	
	public void method3() 
	{
		System.out.println("Method 3");
	}

	public static void main(String[] args) 
	{  
		OverrideDemo ob = new OverrideDemo();
		ob.method1();
		ob.method2();
	}
}

