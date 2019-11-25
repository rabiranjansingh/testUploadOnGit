package com.rabi.io_package;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.InputStream;

public class Readingh_from_url {

	public static void main(String[] args) throws MalformedURLException, IOException
	{
		
		// case 1
		//accept file name or directory name through command line args 
        String fname ="E:\\cpptutorial\\cpp\\io_package\\src\\com\\rabi\\io_package\\emp.xml";
  
        //pass the filename or directory name to File object 
        File f = new File(fname); 
  
        //apply File class methods on File object 
        System.out.println("File name :"+f.getName()); 
        System.out.println("Path: "+f.getPath()); 
        System.out.println("Absolute path:" +f.getAbsolutePath()); 
        System.out.println("Parent:"+f.getParent()); 
        System.out.println("Exists :"+f.exists()); 
        if(f.exists()) 
        { 
            System.out.println("Is writeable: "+f.canWrite()); 
            System.out.println("Is readable  "+f.canRead()); 
            System.out.println("Is a directory:  "+f.isDirectory()); 
            System.out.println("File Size in bytes   "+f.length()); 
        }
		
		// output for case one  
        /*
        File name :emp.xml
        Path: E:\cpptutorial\cpp\io_package\src\com\rabi\io_package\emp.xml
        Absolute path:E:\cpptutorial\cpp\io_package\src\com\rabi\io_package\emp.xml
        Parent:E:\cpptutorial\cpp\io_package\src\com\rabi\io_package
        Exists :true
        Is writeable: true
        Is readable  true
        Is a directory:  false
        File Size in bytes   558   */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		InputStream input = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt").openStream();
		
		
		int data=input.read();
		while(data!=-1)
		{
			System.out.println((char)data);
			data=input.read();
		}

	}

}
