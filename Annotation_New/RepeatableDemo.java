package annotationDemo;
import java.lang.annotation.*;
import java.lang.reflect.Method;


//Creating custom annotation
@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.METHOD)
@interface MyAnnotation1{
int value();
}


@Repeatable(value = Authors.class)
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
    String method();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Authors {
    Author[] value();
}


@Author(name="Sachin", method="method1()")
@Author(name="Ajay", method="method2()")

class Hello1{
@MyAnnotation1(value=10)
public void method1(){
	System.out.println("Method1");
	}

@MyAnnotation1(value=15)
public void method2(){
	System.out.println("Method2");
	}
}

public class RepeatableDemo {

	public static void main(String[] args) throws Exception {
       
		Hello1 h=new Hello1();
		
		Method m=h.getClass().getMethod("method1");
		MyAnnotation1 manno=m.getAnnotation(MyAnnotation1.class);
		System.out.println("For "+m.getName()+" Value is: "+manno.value());
		
		m=h.getClass().getMethod("method2");
		manno=m.getAnnotation(MyAnnotation1.class);
		System.out.println("For "+m.getName()+" Value is: "+manno.value());
		
		Author[] authArray = h.getClass().getAnnotationsByType(Author.class);
		for(Author author: authArray)
		{
			System.out.println(author.method()+" is created by "+author.name());
		}

	}

}
