package learnathon.batch15.day7.strings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class TextPreProcessing {
	public static String process(File file) throws IOException {
		StringBuilder text = new StringBuilder();
		StringJoiner joiner = new StringJoiner(" ");
		
		//read the text file into the StringBuilder
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
	
		try {
			while((line = br.readLine()) != null) {
				text.append(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			br.close();
		}
		
		//print the raw text
		System.out.println("RAW TEXT");
		System.out.println(text.toString());
		System.out.println();
		
		//print the number of tokens that are available
		StringTokenizer tokenizer = new StringTokenizer(text.toString());
		System.out.println("Number of tokens = " + tokenizer.countTokens());
		
		//while there are token in the text,
		//convert each token into smaller case
		//(optional) - remove the punctuation
		//print the token
		//join the token with a space
		
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken()
							.toLowerCase()
							.replaceAll("[^a-zA-Z]", "");
			System.out.println(token);
			
			joiner.add(token);			
		}
		
		//return the converted string
		return joiner.toString();
	}
	
	
	public static void main(String[] args) throws IOException {
		File f = new File("SampleText.txt");
		
		String text = TextPreProcessing.process(f);
		System.out.println("PROCESSED TEXT");
		System.out.println(text);
		
		StringTokenizer tokenizer = new StringTokenizer(text);
		System.out.println("After clearning the count of tokens = " + tokenizer.countTokens());
		
	}
}
