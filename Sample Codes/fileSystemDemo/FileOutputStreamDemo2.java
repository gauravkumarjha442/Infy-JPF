package fileSystemDemo;

import java.io.FileOutputStream;

public class FileOutputStreamDemo2 {
	public static void main(String args[]){    
        try{                                        // Writing a string
          FileOutputStream fout=new FileOutputStream("D:\\DemoFile2.txt");    
          String s="Java Programming";    
          byte b[]=s.getBytes();//converting string into byte array    
          fout.write(b);    
          fout.close();    
          System.out.println("Data is written successfully...");    
         }catch(Exception e){System.out.println(e);}    
   }    
}
