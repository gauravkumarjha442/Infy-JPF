package functionalInterfaceLambaDemo;

@FunctionalInterface
interface Square {
    int calculate(int x);
}


public class FunInterface2 {
	
	public static void main(String args[])
    {
        int a = 5;
  
        
        Square square = (x) -> x * x;// lambda expression to define the calculate method
  
        // parameter passed and return type must be same as defined in the prototype
        int result = square.calculate(a);
        System.out.println(result);
    }
}
