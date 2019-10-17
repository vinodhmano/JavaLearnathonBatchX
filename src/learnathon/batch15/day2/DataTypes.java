package learnathon.batch15.day2;

public class DataTypes {
	public static void main(String[] args) {
		//Character is 8 bit 
		char c = 'A';
		System.out.println(c);

		//Byte is 16 bit +-2^16 -128 to 127
		byte b = 127;       
		System.out.println(b);
		
		//short is 32
		short s = 2004;
		System.out.println(s);
		
		//int 64
		int i = 1933434830;
		System.out.println(i);
				
		//long
		long l = 340384038493L;
		System.out.println(l);
		
		//float
		float x = 10.0f;
		float y = 3.0f;
		float z = x/y;
		System.out.println(z);
		
		//double 
		double d = 298.98;
		System.out.println(d);
		
		//boolean True or False
		boolean t = true;
		boolean f = false;
		System.out.println(t);
		System.out.println(f);
		
		
		//Size of datatypes
		System.out.println("Size of byte = " + Byte.SIZE/8 + " bytes");
		System.out.println("Size of short = " + Short.SIZE/8 + " bytes");
		System.out.println("Size of int = " + Integer.SIZE/8 + " bytes");
		System.out.println("Size of long  = " + Long.SIZE/8 + " bytes");
		System.out.println("Size of char = " + Character.SIZE/8 + " bytes");
		System.out.println("Size of float = " + Float.SIZE/8 + " bytes");
		System.out.println("Size of double = " + Double.SIZE/8 + " bytes");
		
	}
	

}
