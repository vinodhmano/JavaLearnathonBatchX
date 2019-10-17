package learnathon.batch15.day4;

class Adder{
	public int add(int a, int b) {
		System.out.println("I have 2 int parameters");
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		System.out.println("I have 3 int parameters");
		return a+b+c;
	}
	
	public float add(float a, float b) {
		System.out.println("I have 2 float parameters");
		return a+b;
	}
}


public class TestOverloading1{
	public static void main(String[] args) {
		Adder adder = new Adder();
		
		System.out.println(adder.add(4.0f, 5.0f));
		System.out.println(adder.add(1, 2));
		System.out.println(adder.add(1, 2,3));
		
		//Type . and see the list of overloaded methods
		//System.out.print
	}
}