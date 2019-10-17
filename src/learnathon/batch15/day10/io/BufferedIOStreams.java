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

public class BufferedIOStreams {
	public static void main(String[] args) throws IOException {
		
		//read files in byte format
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("largerfile.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("buffered_bytestream_output.txt"));
		
		try {
			int b;
			while((b = bis.read()) != -1) {
				bos.write(b);
			}
		}finally {
			if(bis != null) bis.close();
			if(bos != null) bos.close();
		}
		
		
		//read files in character format
		BufferedReader br = new BufferedReader(new FileReader("largerfile.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("buffered_charstream_output.txt"));
		
		try {
			String s;
			while((s = br.readLine()) != null) {
				bw.write(s);
			}
		}finally {
			if(br != null) br.close();
			if(bw != null) bw.close();
		}
		
	}
}
