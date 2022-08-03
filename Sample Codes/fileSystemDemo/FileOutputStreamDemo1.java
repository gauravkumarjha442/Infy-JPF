package fileSystemDemo;

import java.io.FileOutputStream;  
public class FileOutputStreamDemo1 {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("D:\\DemoFile8888.txt");    
             fout.write(65);    //Writing single character
             fout.write(66); 
             fout.write(67); 
             fout.write('D');
             fout.write('5');
             fout.close();    
             System.out.println("Data is written successfully...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  