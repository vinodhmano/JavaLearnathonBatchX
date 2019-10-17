package learnathon.batch15.day7.strings;

public class WrapperOfWrapper {
	Boolean b;
	Byte bt;
	Short sh;
	Integer Int;
	Long l;
	Float f;
	Double d;
	Character c;
	
	public String toString() {
		String output = "Boolean = " + b + "Byte = " + bt + "Short = " + sh;
		output = output + " Integer = " + Int + " Long = " + l + " Float = " + f;
		output += " Double = " + d + " Character = " + c;
		
		return output;
	}
}
