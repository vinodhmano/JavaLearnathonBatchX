package learnathon.batch15.day3;

public class Tobedeleted {
	public static void main(String[] args) {
		int[] intarray = new int[5];
//		intarray[0] = 10;
//		intarray[1] = 20;
//		intarray[3] = 500;
//		intarray[2] = 900;
		
		System.out.println(intarray[0]);
		
		
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[2] = "Program";
		
		System.out.println(strArray[2]);
		
		String[] java = {"Java","String","Array","variable"};
		System.out.println(java.length);
		
		int[] thousand = new int[1000];
		int i=0;
		
		while(i<1000) {
			thousand[i] = i;
			i++;
		}
		
		int[] greaterthan500 = new int[500];
		System.arraycopy(thousand, 501, greaterthan500, 0, 499);
		
		System.out.println(greaterthan500[400]);
	}

}
