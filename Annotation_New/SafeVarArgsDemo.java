package annotationDemo;

import java.util.ArrayList;
import java.util.List;



public class SafeVarArgsDemo {
	
   @SafeVarargs
	//@SuppressWarnings("unchecked")
	private final void display(List<String>... products) {

		for (List<String> product : products) {
			System.out.println(product);
		}
	}
	

	public static void main(String[] args){
		SafeVarArgsDemo obj = new SafeVarArgsDemo();
		
		List<String> list1 = new ArrayList<>();
		list1.add("Laptop");
		list1.add("iPad");
		
		List<String> list2 = new ArrayList<>();
		list2.add("Mobile");
		list2.add("Handycam");
		
		obj.display(list1, list2);

	}
}
