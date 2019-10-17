package learnathon.batch15.day2;

public class Casting {
	public static void main(String[] args){
		
		int i = 100;  //32 bit
		
		//Implicit casting
		//LHS is larger than RHS
		//long is larger than int 64 bit
		long l = i;
		System.out.println("After implicit casting l = " + l);
		
		
		
		//Explicit casting
		//LHS is smaller than RHS
		//int is smaller than long
		
		int li = (int) l;
		System.out.println("int li = " + li);
		
		float f = 10.23f;
		int fi = (int) f;

		System.out.println("float f = " + f);
		System.out.println("int fi = " + fi);
		
	}
}
