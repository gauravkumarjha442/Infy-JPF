package annotationDemo;

import java.lang.annotation.*;
import java.lang.reflect.Method;


//Creating custom annotation
@Retention(RetentionPolicy.RUNTIME) // Change the Retention to SOURCE and CLASS, and see the output
@Target(ElementType.METHOD)
//@Target({ElementType.METHOD, ElementType.TYPE})
@Documented
@interface MyAnnotation{
int value();
}

//Declaring annotation
//@MyAnnotation(value=10)
class Hello{
	
@MyAnnotation(value=10)
public void method1(){
	System.out.println("Method1");
	}


@MyAnnotation(value=15)
public void method2(){
	System.out.println("Method2");
	}
}

public class CustomAnnonationDemo1 {
	public static void main(String args[])throws Exception{

		Hello h=new Hello();
		
		Method m=h.getClass().getMethod("method1");
		MyAnnotation manno=m.getAnnotation(MyAnnotation.class);
		System.out.println("value is: "+manno.value());
		
		m=h.getClass().getMethod("method2");
		manno=m.getAnnotation(MyAnnotation.class);
		System.out.println("value is: "+manno.value());
		}

}
