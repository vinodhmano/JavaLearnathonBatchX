package learnathon.batch15.day2;

public class SimpleMath {
	//class fields
	int x = 10;
	int y = 20;
	
	public void binaryOperations() {
		//Binary operations
		// + operator
		
		System.out.println("Binary Operations");
		int sum = x + y;
		System.out.println("+ operator on 2 numbers = " + sum);
		
		// - operator
		int diff = x - y;
		System.out.println("- operator on 2 numbers = " + diff);

		// / operator
		System.out.println("/ operator on 2 numbers = " + y/x);
		
		// * operator
		System.out.printf("* operator on 2 numbers = %d\n", x*y);
		
		// % operator
		System.out.println("% operator on 2 numbers = " + 20%3);	
		System.out.println();
	}
	
	public void unaryOperations() {
		//Unary Operators
		// ++ operator in post increment
		
		System.out.println("Unary Operations");
		
		int postx = x++;
		System.out.println("postx " + postx);
		System.out.println("x " + x);
		
		//++ operator in pre increment
		int pre_y = ++y;
		System.out.println("pre_y " + pre_y);
		System.out.println("y " + y);
		
		// -- operator in post decrement
		postx = x--;
		System.out.println("postx " + postx);
		System.out.println("x " + x);
		
		//-- operator in pre decrement
		pre_y = --y;
		System.out.println("pre_y " + pre_y);
		System.out.println("y " + y);
		
		System.out.println();
	}
	
	public void ternaryOperations() {
		System.out.println("Ternary Operations");
		//Syntax
		// result = condition ? value if true : value if false
		int greatest = x>y ? x : y;
		System.out.printf("The greatest number of %d and %d is %d", x,y,greatest);
		System.out.println();
	}
	
	public void relationalOperators() {
		System.out.println("Relational Operations");
		
		// > operator
		System.out.println("Is x  > y? " + (x>y));
		
		// < operator
		System.out.println("Is x  < y? " + (x<y));
		
		// >= operator
		System.out.println("Is x  >= 10? " + (x>=10));
		
		// <= operator
		System.out.println("Is x  <= 10? " + (x<=10));
		
		// == operator
		System.out.println("Is x  == 10? " + (x==10));  //this is different from x=10
		
		// != operator
		System.out.println("Is x  != 10? " + (x!=10));
		
		// && operator
		System.out.println("Is x  == 10 AND x < 50? " + ( (x==10) && (x<50) ) );
		
		// || operator
		System.out.println("Is x  == 10 OR x > 50? " + ( (x==10) || (x>50) ) );
		
		System.out.println();
	}
	
	public void precedence() {
		int p = 25;
		int q = 50;
		//int x = 10;
		//int y = 20;
		
		boolean ans = x * (y + 100) > q-p; 
					/*= 10 * (20 + 100) > 50 - 25
					= 10 * 120 > 50 - 25
					= 1200 > 50 - 25
					= 1200 > 25
					= true */
		System.out.println(ans);
		
	}
	
	public static void main(String[] args){
		SimpleMath sm = new SimpleMath();
		
		//sm.unaryOperations();
		//sm.binaryOperations();
		//sm.ternaryOperations();
		//sm.relationalOperators();
		//sm.precedence();

	}
}
