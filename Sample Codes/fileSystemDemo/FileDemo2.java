package fileSystemDemo;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {  
	    File f=new File("D:\\");  

	    String filenames[]=f.list();  
	    for(String filename:filenames){  
	        System.out.println(filename);  
	    }  
	}  
}
