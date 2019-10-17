package learnathon.batch15.day9.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException; 

public class CheckedException {

	/* the following main method throws IOException
	   but there is no program to catch the exception and handle it
	   so it is handled by the jvm
	   jvm simply terminates the program
	   when we throw a exception, we should write a program to catch and handle it
	 */
	
	public static void main(String[] args) throws IOException { 
		FileReader file = new FileReader("C:\\test\\a.txt");
	    BufferedReader fileInput = new BufferedReader(file); 
	          
	    // Print first 3 lines of file "C:\test\a.txt" 
	    for (int counter = 0; counter < 3; counter++) {
			System.out.println(fileInput.readLine());
		} 
	    
	    //close the filereader after reading
	    file.close();
	    fileInput.close();	 
	} 
}
