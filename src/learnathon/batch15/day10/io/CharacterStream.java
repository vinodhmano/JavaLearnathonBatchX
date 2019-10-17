package learnathon.batch15.day10.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Program to demonstrate character streams
//Reads and writes to file char by char (16 bits)

public class CharacterStream {
	public static void main(String[] args) throws IOException{
		FileReader in = null;
		FileWriter out = null;
		
		try {
			in = new FileReader("input.txt");
			out = new FileWriter("char_output.txt");
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
		}finally {
			if(in != null) in.close();
			if(out != null) out.close();
		}
	}
}
