package fileSystemDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamDemo2 {
	public static void main(String args[]){    
//        try{    
//          FileInputStream fin=new FileInputStream("D:\\DemoFile3.txt");    
//          int i=0;    
//          while((i=fin.read())!=-1){    //Java Programming
//           System.out.print((char)i);    //Java Programming
//          }  
//          
//        
//          
//          fin.close();    
//        }catch(Exception e){System.out.println(e);}    
		
		
		//Copy one image file into another   
//		try{    
//	          FileInputStream fin=new FileInputStream("D:\\A.jpg");  
//	          FileOutputStream fout=new FileOutputStream("D:\\B.jpg");
//         
//	          int i=0;    
//	          while((i=fin.read())!=-1){   
//	        	//  System.out.print(i);
//	        	  fout.write(i);     
//	          }    
//	          System.out.println("File is copied successfully...");
//	          fin.close();    
//	          fout.close(); 
//	        }catch(Exception e){System.out.println(e);}  
        
		
		//Copy one video file into another using FileInputStream and FileOutputStream
		
//		try{    
//	          FileInputStream fin=new FileInputStream("D:\\v1.mp4");  
//	          FileOutputStream fout=new FileOutputStream("D:\\v2.mp4");
//	          
//	          int i=0;    
//	          while((i=fin.read())!=-1){    
//	        	  fout.write(i);     
//	          }    
//	          System.out.println("File is copied successfully...");
//	          fin.close();    
//	          fout.close(); 
//	        }catch(Exception e){System.out.println(e);}  
		
		//Copy one video file into another using BufferedInputStream and BufferedOutputStream
		//Observe the difference in time required to copy
		
        try{    
		    FileInputStream fin=new FileInputStream("D:\\v1.mp4");    
		    BufferedInputStream bin=new BufferedInputStream(fin);
		    
		    FileOutputStream fout=new FileOutputStream("D:\\v2.mp4");    
		    BufferedOutputStream bout=new BufferedOutputStream(fout);    
		    
		    int i;    
		    while((i=bin.read())!=-1){    
		    	 bout.write(i);       
		    }    
		    System.out.println("File is copied successfully...");
		    bin.close();    
		    bout.close();  
		    fin.close();
		    fout.close();
		  }catch(Exception e){System.out.println(e);}    
		
		
		 }    
		
       }    

