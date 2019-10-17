package learnathon.batch15.day7.strings;


public class EnumDemo {
	enum Day_{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}
	
	enum MESSAGE{
		INFO, WARNING, COMPILE_ERROR, RUNTIME_ERROR, EXCEPTION
	}
	
	public static void main(String[] args) {
		Day_ day;
		MESSAGE level;
		
		//the following code won't work
		//day = "MONDAY";
		
		day = Day_.WEDNESDAY;
		System.out.println(day.ordinal());
		
		level = MESSAGE.WARNING;
		
		switch(level) {
		case INFO:
			System.out.println("Just an Information message. No action required");
			break;
		
		case WARNING:
			System.out.println("It's a warning message. Action may be required");
			break;
			
		case COMPILE_ERROR: case RUNTIME_ERROR: case EXCEPTION:
			System.out.println("Action is required");
			break;
		}
	}

}
