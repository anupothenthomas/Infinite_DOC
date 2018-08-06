package fileIO_DOC;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile 
{	
	public static void main(String args[])
	{
	System.out.println("This is first program to creat a file in java:");
	
	try
	{
		File ns = new File("C:\\Users\\Hp\\Desktop\\anu.txt");
		
	
	boolean hana = ns.createNewFile();
	
	if(hana)
	{
		System.out.println("File created");
		
	}
	else
	{
		System.out.println("File not created");
	}
	
	}
	catch(IOException ie)
	{
		System.out.println("Error ocurred");
		ie.printStackTrace();
	}
	
	}
	
	

}
