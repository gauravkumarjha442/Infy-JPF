package functionalInterfaceLambaDemo;

public class FunInterface1 {
	public static void main(String args[])
    {
        // Without Lambda Expression (by creating anonymous inner class object) 
        new Thread(new Runnable() {
           @Override 
            public void run()
            {
                System.out.println("New thread created");
            }
        }).start();
        
        // Using Lambda Expression
//        new Thread(() -> { System.out.println("New thread created"); }).start();
    }
}
