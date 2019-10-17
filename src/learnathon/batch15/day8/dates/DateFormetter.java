package learnathon.batch15.day8.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DateFormetter {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date today = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
		System.out.println(today);
		System.out.println(df.format(today));
		
		
		df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
		System.out.println(df.format(today));
		
		
		Date unformatted = new Date();
        DateFormat formatted;
        formatted = DateFormat.getDateInstance(DateFormat.FULL, Locale.UK);
        System.out.println("United Kingdom : " + formatted.format(unformatted));
        formatted = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        System.out.println("United States  : " + formatted.format(unformatted));
        formatted = DateFormat.getDateInstance(DateFormat.SHORT, Locale.UK);
        System.out.println("United Kingdom : " + formatted.format(unformatted));
        formatted = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        System.out.println("United States : " + formatted.format(unformatted));
        formatted = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
        System.out.println("United Kingdom : " + formatted.format(unformatted));
        formatted = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
        System.out.println("United States : " + formatted.format(unformatted));

      //to find difference between 2 days
      		try {
      			Date doj = df.parse("8/11/19");
      			Date curDate = df.parse(df.format(new Date()));
      			System.out.println("Total Experience is : " + 
      					TimeUnit.DAYS.convert(
      							(Math.abs(doj.getTime() - curDate.getTime())),
      							TimeUnit.MILLISECONDS
      							)
      			+ " days");
      				
      		} catch (ParseException e) {
      			// TODO Auto-generated catch block
      			e.printStackTrace();
      		}
      		
      		
	}
}
