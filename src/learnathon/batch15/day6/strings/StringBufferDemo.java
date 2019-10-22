package learnathon.batch15.day6.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		//Construct a StringBuffer object
		StringBuffer hw = new StringBuffer()
				.append("hello")
				.append("world");
		
		System.out.println(hw);
		
		//insert string in a particular index
		hw.insert(5, "_Java");
		System.out.println(hw);
		hw.insert(10, " ");
		System.out.println(hw);
		
		//replace a string from a position to a position
		hw.replace(5, 6, " ");
		System.out.println(hw);
		
		
		System.out.println(hw.charAt(6));
		System.out.println(hw.deleteCharAt(3));
		System.out.println(hw.capacity());
		System.out.println(hw.reverse());
		
		String str = "Hello World";
		StringBuffer sbr = new StringBuffer(str);

	}

}
