package fileSystemDemo;

import java.io.FileReader;
import java.io.Reader;

public class ReaderDemo {
	 public static void main(String[] args) {  
	        try {  
	            Reader reader = new FileReader("D:\\DemoFile7.txt");  
	            int data = reader.read();  
	            while (data != -1) {  
	                System.out.print((char) data);  
	                data = reader.read();  
	            }  
	            reader.close();  
	        } catch (Exception ex) {  
	            System.out.println(ex.getMessage());  
	        }  
		 
		 
	    }  
}
