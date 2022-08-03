package fileSystemDemo;

import java.io.FileWriter;

public class FileWriterDemo {
	public static void main(String args[]){    
        try{    
          FileWriter fw=new FileWriter("D:\\DemoFile8.txt");    
          fw.write("Java Programming");   
          fw.close();    
         }catch(Exception e){System.out.println(e);}    
         System.out.println("Data is written successfully...");    
    }    
}
