package fileSystemDemo;

import java.io.FileInputStream;

public class FileInputStreamDemo1 {
	 public static void main(String args[]){    
         try{    
           FileInputStream fin=new FileInputStream("D:\\DemoFile3.txt");    
           int i=fin.read();    //Reading a single character
           System.out.print((char)i);    
 
            i=fin.read();    //Reading a single character
           System.out.print((char)i);  
           
           fin.close();    
         }catch(Exception e){System.out.println(e);}    
        }    
}
