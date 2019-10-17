package learnathon.batch15.day10.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//Program to demonstrate to read a whole line
//It uses the char stream to read until the end of the line (EOL)
//EOL is usually determine by new line character \n, carriage return \r etc.,

public class DLineReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = null;
		PrintWriter writer = null;
		
		try {
			reader = new BufferedReader(new FileReader("input.txt"));
			writer = new PrintWriter(new FileWriter("LineReaderOutput.txt"));
			String l;
			
			while((l = reader.readLine()) != null) {
				//writer.append(l);
				writer.write(l);
				writer.write("\r\n");
			}
		}finally {
			if(reader != null) reader.close();
			if(writer != null) writer.close();
		}
	}

}
