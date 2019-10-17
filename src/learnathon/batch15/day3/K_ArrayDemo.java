package learnathon.batch15.day3;

public class K_ArrayDemo {
	public static void main(String[] args){
		
		//Single dimension array
		String[] fruits;
		fruits = new String[5];
		
		//String[] vegetables = new String[10];
		
		System.out.println(fruits.length);
		
		fruits[0] = "Apple";
		fruits[1] = "Banana";
		fruits[3] = "Orange";
		fruits[2] = "Strawberry";
		fruits[4] = "Pears";
		//fruits[5] = "new Fruit";
		
		System.out.println("1st fruit = " + fruits[0]);
		System.out.println("2nd fruit = " + fruits[1]);
		System.out.println("3rd fruit = " + fruits[2]);
		System.out.println("4th fruit = " + fruits[3]);
		System.out.println("5th fruit = " + fruits[4]);
		//System.out.println("5th fruit = " + fruits[5]);
		
		String[] vegetables = {"Onion","Brinjal","Cucumber","Potatoes"};
		System.out.println(vegetables.length);
		
		//iterating through an array using for loop
		for(int i=0; i<vegetables.length; i++){
			System.out.println("The " + (i+1) + " th vegetable is " + vegetables[i]);
		}
		
		
		//Square of numbers
		int[] numbers = new int[10];

		for(int i=0; i<numbers.length; i++){
			numbers[i] = i*i;
		}
		
		for(int i=0; i<numbers.length; i++){
			System.out.println("Index " + i + " = " + numbers[i]);
		}
		
		//syntax for Arraycopy
		//System.arraycopy(src, srcPos, dest, destPos, length);
		int[] anotherNum = new int[5];
		System.arraycopy(numbers, 1, anotherNum, 0, 5);
		
		for(int i=0; i<anotherNum.length; i++){
			System.out.println("The " + (i+1) + " th anotherNum is " + anotherNum[i]);
		}
		
		
		int[] odn = {2,3,4,5,3};
		int[][] tdn = {
				{1,2,3},
				{4,5,6}
				};


		String[][] names = {            
				{"Mr. ", "Mrs. ", "Ms. "},
	            {"Smith", "Jones"}
			};
		
		System.out.println("(1,0) = " + names[1][0]);
		
		names[1][0] = "Steve";
		
		System.out.println("(1,0) = " + names[1][0]);		
	}
	
}
