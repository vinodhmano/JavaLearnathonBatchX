package learnathon.batch15.day7.strings;

//import java.util.ArrayList;

public class WrapperMain {
	public static void main(String[] args) {
		
		int i = 10;
		Integer I = i;
		System.out.println(I.intValue());
		
		//This will not work
		//ArrayList<int> al = new ArrayList<int>();
		//This will work
		//ArrayList<Integer> al = new ArrayList<Integer>();
		
		WrapperOfWrapper ww = new WrapperOfWrapper();
		
		ww.b = new Boolean("true");
		ww.bt = new Byte("2");
		ww.sh = new Short("4");
		ww.Int = new Integer("120");
		ww.l = new Long("890");
		ww.f = new Float("12.55");
		ww.d = new Double("190.99");
		ww.c = new Character('A'); //single quotes
		
		System.out.println(ww.toString());
		
		Double d1 = new Double("100.99");
		Double d2 = new Double("100.99");
		
		System.out.println(d1.equals(d2));
		
		double d3 = 100.99;
		double d4 = 100.99;
		System.out.println(d3 == d4);
		

	}
}
