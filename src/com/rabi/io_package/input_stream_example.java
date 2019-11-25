package com.rabi.io_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;



public class input_stream_example {

	public static void main(String[] args) throws IOException
	{
		InputStream inputstream = new FileInputStream("C:\\Users\\addin\\Downloads\\676cf0a662ba11e9.txt.clean.txt");

		
		
	    //determine how many bytes to read
		System.out.println("inputstream.available(); "+	inputstream.available());
		
		
		int data;
		try 
		{
			data = inputstream.read(); //when read();  return -1 then means that there 
			                           // are no more bytes to read from the InputStream
			while(data != -1)
			{
				  System.out.println("data is "+data  +" "+(char)data);  // here data is asci character
				  data = inputstream.read();

			
			}
			
			
		}// try block
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	
		
		
		System.out.println("--------------------------------------------------- ");
		
		// second condiotion
		
        //Reading an array of bytes at a time is faster than reading a single byte at a time from a Java InputStream.
		byte[]  byte_array      = new byte[1024];
		System.out.println("  array  "+byte_array.length);
		int    bytesRead = inputstream.read(byte_array);

		while(bytesRead != -1) 
		{
		 
            
		  System.out.println("  array  "+byte_array);
		  System.out.println("  bytesRead  "+bytesRead);
		  bytesRead = inputstream.read(byte_array);
		  
		  System.out.println("  bytesRead  "+bytesRead);  // this return - 1
		}
		inputstream.close();
		
		
		
		for(int i=0;i<byte_array.length;i++)
		{
			//System.out.println(" byte is "+ byte_array[i]);
		}
		
		
		
		
		
		
		inputstream.close();

	}

}
