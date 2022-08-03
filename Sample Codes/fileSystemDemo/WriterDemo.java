package fileSystemDemo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
	public static void main(String[] args) {  
        try {  
            Writer w = new FileWriter("D:\\DemoFile6.txt");  
            String content = "Java Programming";  
            w.write(content);  
            w.close();  
            System.out.println("Data is written successfully...");  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}
