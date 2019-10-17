package learnathon.batch15.day3;

public class UseStudent {
	public static void main(String[] args){
		B_Student s = new B_Student();
		s.name = "America";
		s.age = 22;
		s.country = "US";
		s.mark1 = 85;
		s.mark2 = 95;
		
		int total = s.totalMarks();
		
		s.printStudentDetails();
		s.isAllowedToVote();
		System.out.println("Total Marks : " + total);
	}
}
