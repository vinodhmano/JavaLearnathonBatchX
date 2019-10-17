package learnathon.batch15.day3;

public class J_ContinueExample {
	
	   public static void main(String args[]) {
	      int [] numbers = {10, 20, 3, 40, 50};

//	      iteration 1 : x = 10
//	      iteration 2 : x = 20
//	      iteration 5 : x = 50
	      
	      for(int x : numbers) {
	         if( x < 10 ) {
	            continue; //don't execute the remaining of for loop
	         }
	         System.out.print( x );
	         System.out.print("\n");
	         //
	         //
	         //
	         //
	      }
	      
	      System.out.println("Out of for loop");
	   }
	}
