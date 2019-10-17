package learnathon.batch15.day7.strings;

import static java.lang.System.out;

public class StringConstructorDemo {
	public static void main(String[] args) {
		
		//To demo the String Constructors
		
		//constructing from char array
		char[] c = {'H','e','l','l','o'};
		String s1 = new String(c);
		out.println("s1 = " + s1);
		
		//constructing from byte array
		byte[] b = {'W','o','r','l','d'};
		String s2 = new String(b);
		out.println("s2 = " + s2);
		
		//constructing from char array with range
		String s3 = new String(c,1,4);
		out.println("s3 = " + s3);
		
		//constructing from another string
		String s4 = new String(s3);
		out.println("s4 = " + s4);
		
		//Copying from another string
		String s5 = s1;
		out.println("s5 = " + s5);
		
		//Blank string
		String s6 = new String();
		out.println("s6 = " + s6);
		
		//String are immutable
		//value can't be changed
		String name = "Vinodh";

		//below function returns new string that will be printed
		out.println("Changed name = " + name.replace("Vinodh", "new name"));
		
		//original value is still retained, since it is final
		out.println("Original name = " + name);
		
		//first occurrence of a character
		String sentence = "       The String Class represents character strings. All string literals in Java programs, "
				+ "such as \"abc\", are implemented as instances of this class.        ";
		out.println("Index of 'i' = " + sentence.indexOf('i'));
		
		//To print a particular character
		out.println("The char at index 11 = " + sentence.charAt(11));
		
		
		//To convert to lower case
		String lowerSentence = sentence.toLowerCase();
		out.println("Convereted to lower case \n" + lowerSentence);		
		
		
		//To compare 2 string
		out.print("sentence == lowerSentence? " + sentence.equals(lowerSentence) + "\n");
		out.println("sentence == lowerSentence when case ignored? " + sentence.equalsIgnoreCase(lowerSentence));
	
		//Remove extra leading and trailing spaces
		out.println("Trimmed sentence");
		out.println(sentence.trim());
	
		out.println("Hello".toLowerCase());
		
		//concat, replace, replaceFirst demo
		String multifunction = "name is vinodh."
				.concat(" email is sample.email@gmail.com")
				.replace("sample", "work")
				.replaceFirst("@[a-zA-Z]+", "@yahoo");
		out.print("multifunction result = " + multifunction);
	}
	
	
}
