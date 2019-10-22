package learnathon.batch15.day6.strings;

//import java.util.ArrayList;

public class WrapperMain {
	public static void main(String[] args) {
		
		int i = 10;
		Integer I = i;
		System.out.println(I.intValue());
		
		Double d1 = new Double("100.99");
		Double d2 = new Double("100.99");
		
		System.out.println(d1.equals(d2));
		
		double d3 = 100.99;
		double d4 = 100.99;
		System.out.println(d3 == d4);
		

	}
}
