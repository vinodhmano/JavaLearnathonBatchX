package learnathon.batch15.day10.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Program to demonstrate byte streams
//Reads and writes to file byte by byte (8 bits)

public class ByteStreams {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		String home = new File("input.txt").getAbsolutePath();
		System.out.println("Home directory : " + home);
		
		
		try {
			//new File() is optional
			
			//in = new FileInputStream(new File("input.txt"));
			in = new FileInputStream("input.txt");
			
			//out = new FileOutputStream(new File("output.txt"));
			out = new FileOutputStream("output.txt");
			
			int c;
			
			while((c = in.read())!= -1) {
				out.write(c);
				System.out.print((char)c);
			}
		}finally {
				if(in != null) {
					in.close();
				}
				if(out != null) {
					out.close();
				}
		}
		
	}
}
