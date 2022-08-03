package functionalInterfaceLambaDemo;

import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierInterfaceDemo {
	public static void main(String args[])
    {
  
        // This function returns a random value.
        Supplier<Double> randomValue = () -> Math.random();
        LongSupplier randomValue1 = () -> (long) (Math.random()*100); // without multiplying with 100, we will get only 0
        // Print the random value using get()
        System.out.println(randomValue.get()); //Use get() method for Supplier
        System.out.println(randomValue1.getAsLong()); //Use getAsLong() method for LongSupplier
   }
}
