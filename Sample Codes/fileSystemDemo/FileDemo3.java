package fileSystemDemo;

import java.io.File;

public class FileDemo3 {
	public static void main(String[] args) {  
	    File dir=new File("D:\\");  
	    File files[]=dir.listFiles();  
	    for(File file:files){  
	        System.out.println(file.getName()+"****Can Write: "+file.canWrite()+
	        "****Is Hidden: "+file.isHidden()+"****Length: "+file.length()+" bytes");  
	    }  
	}  
}
