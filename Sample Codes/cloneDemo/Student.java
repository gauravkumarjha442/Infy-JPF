package cloneDemo;

public class Student implements Cloneable{

	int rollno;  
	String name;  
	  
	Student(int rollno,String name){   //Constructor
	this.rollno=rollno;  
	this.name=name;  
	}  
	  
	public Object clone()throws CloneNotSupportedException{  //Clone Method
	return super.clone();  
	}  
	
	public static void main(String[] args) {
		
		try{  
		Student s1=new Student(100,"Sachin");  
		  
		Student s2=(Student)s1.clone();  
		  
		System.out.println(s1.rollno+" "+s1.name);  
		System.out.println(s2.rollno+" "+s2.name);  
		
		//System.out.println(s1.equals(s2)); 
		
		}
		catch(CloneNotSupportedException c){
			System.out.println(c);
		}  
		  
		}  

	}


