package annotationDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// creating custom annotation

//@Retention(RetentionPolicy.SOURCE)  //Observe the change by removing comment (SOURCE or RUNTIME)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited

@interface ChangeDetail2 {
	String authorName();
	String methodName();
	int id() default 1004;
}

//Declaring annotation for parent class
@ChangeDetail2(authorName = "Sachin" , methodName = "price")
class SmartPhone {     //Parent class
	String modelNo;
}

// creating subclass
class Nokia2 extends SmartPhone {  //Child class

}



class InheritedAnnotationDemo1 {

	public static void main(String[] args) {
		System.out.println("Super Class (SmartPhone) Annotation = " + new SmartPhone().getClass().getAnnotation(ChangeDetail2.class));
		System.out.println("Sub Class(Nokia2) Annotation = " +  new Nokia2().getClass().getAnnotation(ChangeDetail2.class));
	}

}


