package annotationDemo;


import java.util.ArrayList;

public class SuppressWarningsDemo {
	
//	@SuppressWarnings("unchecked")
	@SuppressWarnings({"unchecked","rawtypes"}) 
		public static void main(String[] args) {
		
	//@SuppressWarnings("rawtypes") 
		ArrayList list=new ArrayList(); 
		//ArrayList <String>  list=new ArrayList <String>();  
	
	    list.add("Sachin");  
		list.add("Virat");  
		list.add("Rohit");  
		list.add(10);
		
		  
		for(Object obj:list)  
		System.out.println(obj);  
		
	@SuppressWarnings("unused") 
		int x = 5;
		

}
}
