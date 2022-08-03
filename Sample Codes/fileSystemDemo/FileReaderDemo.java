package fileSystemDemo;

import java.io.FileReader;

public class FileReaderDemo {
	public static void main(String args[])throws Exception{    
        FileReader fr=new FileReader("D:\\DemoFile9.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close();    
  }    
}
