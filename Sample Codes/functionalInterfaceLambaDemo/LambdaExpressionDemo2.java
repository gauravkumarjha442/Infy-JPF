package functionalInterfaceLambaDemo;

interface A2{  
    public void check(int a);  
}  

interface A3{  
    public int sum(int a, int b);  
}  

public class LambdaExpressionDemo2 {  

public static void main(String[] args) {  

	//Lambda Expression with one argument
A2 ob2 = (x) -> { if(x%2 == 0) System.out.println("Even"); else System.out.println("Odd");};
ob2.check(15);


//Lambda Expression with two arguments
A3 ob3 = (x,y) -> { return(x+y); };  // Curly braces are required if body has return statement

int result = ob3.sum(10, 20);
System.out.println("Addition = "+result);
}  
}  
