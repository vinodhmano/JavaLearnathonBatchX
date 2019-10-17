package learnathon.batch15.day10.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Buffered Streams demo
//Buffered Streams are faster than byte and character readers

public class BufferedIOStreamspptx {
	public static void main(String[] args) throws IOException {
		
		//read files in byte format
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Java_String.pptx"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Out_Java_String.pptx"));
		
		try {
			int b;
			while((b = bis.read()) != -1) {
				bos.write(b);
			}
		}finally {
			if(bis != null) bis.close();
			if(bos != null) bos.close();
		}
		
	/*	
		//read files in character format
		BufferedReader br = new BufferedReader(new FileReader("Java_String.pptx"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C_Out_Java_String.pptx"));
		
		try {
			String s;
			while((s = br.readLine()) != null) {
				bw.write(s);
			}
		}finally {
			if(br != null) br.close();
			if(bw != null) bw.close();
		}
		*/
	}
}
