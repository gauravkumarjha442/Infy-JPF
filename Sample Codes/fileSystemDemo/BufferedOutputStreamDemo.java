package fileSystemDemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamDemo {
	public static void main(String args[])throws Exception{    
	     FileOutputStream fout=new FileOutputStream("D:\\DemoFile4.txt");    
	     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	     //BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream("D:\\DemoFile4.txt")); 
	     String s="Java Programming";    
	     byte b[]=s.getBytes();    
	     bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     System.out.println("Data is written successfully...");    
	}    
}
