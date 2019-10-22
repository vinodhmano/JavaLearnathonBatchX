package learnathon.batch15.day6.strings;


public class EnumDemo {
	
	enum WEEKDAY{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}
	
	enum MESSAGE{
		INFO, WARNING, COMPILE_ERROR, RUNTIME_ERROR, EXCEPTION, ERROR
	}
	
	public static void main(String[] args) {
		WEEKDAY day;
		MESSAGE level;
		
		//the following code won't work
		//day = "MONDAY";
		
		day = WEEKDAY.WEDNESDAY;
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
