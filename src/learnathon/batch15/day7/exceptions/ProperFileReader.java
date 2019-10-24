package learnathon.batch15.day7.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProperFileReader {
	
	public static void main(String[] args) {
		readFile();
	}


	public static void readFile(){
		FileReader file = null;
		BufferedReader fileInput = null;
		try {
			file = new FileReader("C:\\test\\a.txt");
		    fileInput = new BufferedReader(file); 
		          
		    // Print first 3 lines of file "C:\test\a.txt" 
		    for (int counter = 0; counter < 3; counter++) {
				System.out.println(fileInput.readLine());
			} 
		}
		catch(FileNotFoundException fnfe) {
			System.out.println("The file you wanted to read is not found\nCheck the file path");
			System.out.println("So nothing to read. Terminating the program");
			return;	
		}
		catch(IOException ioe) {
			System.out.println("Something happened reading the file. Terminating the program");
			return;
		}
		finally {
			//close the filereader after reading
			try {
				file.close();
			    fileInput.close();
			}catch(IOException ioe) {
				System.out.println("Something happened closing the file. Terminating the program");
				return;
			}
			catch(NullPointerException npe) {
				System.out.println("The file object is null. Terminating the program");
				return;
			}
		}
	}
}
