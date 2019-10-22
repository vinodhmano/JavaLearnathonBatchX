package learnathon.batch15.day7.dates;

import java.util.Calendar;
import java.util.Date;

public class DatesDemo {
	public static void main(String[] args) {
		
		// 7/23/2019
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getTime()); //1563924568672  1563924706149 1563924721746 1563924729506		
		
		//Jan 01 1970 epochs
		
		//Date(String) is deprecated
		Date today = new Date("Jul 23 2019");
		Date tomo = new Date("Jul 24 2019");
		System.out.println(today);
		
		
		Calendar c = Calendar.getInstance(); 

        System.out.println("The Current Date is:" + c.getTime()); 
        
     // Demonstrate Calendar's get()method 
        System.out.println("Current Calendar's Year: " + c.get(Calendar.YEAR)); 
        System.out.println("Current Calendar's Month: " + c.get(Calendar.MONTH)); //0 based index
        System.out.println("Current Calendar's Day: " + c.get(Calendar.DATE)); 
        System.out.println("Current MINUTE: " + c.get(Calendar.MINUTE)); 
        System.out.println("Current SECOND: " + c.get(Calendar.SECOND)); 
        System.out.println("Current day of the week: " + c.get(Calendar.DAY_OF_WEEK)); //Week starts from SUNDAY
        System.out.println("Current week of the year: " + c.get(Calendar.WEEK_OF_YEAR)); 
        int max = c.getMaximum(Calendar.DAY_OF_WEEK); 
        System.out.println("Maximum number of days in a week: " + max); 
          
        max = c.getMaximum(Calendar.WEEK_OF_YEAR); 
        System.out.println("Maximum number of weeks in a year: " + max); 
        
     // Program to demonstrate add() method 
     // of Calendar class 
        
        c.add(Calendar.DATE, -15); 
        System.out.println("15 days ago: " + c.getTime()); 
        c.add(Calendar.MONTH, 4); 
        System.out.println("4 months later: " + c.getTime()); 
        c.add(Calendar.YEAR, 2); 
        System.out.println("2 years later: " + c.getTime()); 
	
        
        //If you want to set to a new date, use .set() method
        //below method is to get the date to Aug 11 1985
        //note that month is a 0 based index
        //so 0 = Jan, 1 = Feb...... 7 = Aug
        c.set(1985, 7, 11);
        System.out.println("The New Date is:" + c.getTime()); 
        
	}
}


//1563909885703
//1563909901523
