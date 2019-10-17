package learnathon.batch15.day10.io;


import java.io.File;
import java.io.IOException;

/**
 * 
 * @author 144725
 * @since 9/19/2019 
 */

public class AFileDemo {	
	public static void main(String[] args) {
		String filepath = "C:\\Users\\144725\\Documents\\Organizational Level Activities\\Java Learnathon\\Day 10";
		
		//Creates a file
		File f = new File(filepath);
		System.out.println(f.getAbsolutePath());
		
		System.out.println(f.isDirectory());
		
		
		//Get a list of files in the folder
		System.out.println(f.isFile());
		
		
		//print the file name
		File[] files = f.listFiles();
		for(File afile: files) {
			System.out.println(afile.getName());
		}
		
		
		//Creating new files using File object
		String filepathdoesnotexist = "C:\\Users\\144725\\Documents\\Organizational Level Activities\\Java Learnathon\\Day 10\\newFile.txt";
		try {
			new File(filepathdoesnotexist).createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
}
