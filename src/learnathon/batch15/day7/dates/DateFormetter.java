package learnathon.batch15.day7.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DateFormetter {
	public static void main(String[] args) {
		Date today = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
		System.out.println(today);
		System.out.println(df.format(today));
		
		
		df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
		System.out.println(df.format(today));
		
		
		Date unformatted = new Date();
        DateFormat formatted;
        
        formatted = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.UK);
        System.out.println("United Kingdom : DEFAULT : " + formatted.format(unformatted));
        formatted = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.US);
        System.out.println("United States : DEFAULT : " + formatted.format(unformatted));
        
        formatted = DateFormat.getDateInstance(DateFormat.SHORT, Locale.UK);
        System.out.println("United Kingdom : SHORT : " + formatted.format(unformatted));
        formatted = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        System.out.println("United States : SHORT : " + formatted.format(unformatted));
        
        formatted = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.UK);
        System.out.println("United Kingdom : MEDIUM : " + formatted.format(unformatted));
        formatted = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
        System.out.println("United States : MEDIUM : " + formatted.format(unformatted));
        
        formatted = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
        System.out.println("United Kingdom : LONG : " + formatted.format(unformatted));
        formatted = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
        System.out.println("United States : LONG : " + formatted.format(unformatted));
        
        formatted = DateFormat.getDateInstance(DateFormat.FULL, Locale.UK);
        System.out.println("United Kingdom : FULL : " + formatted.format(unformatted));
        formatted = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        System.out.println("United States  : FULL : " + formatted.format(unformatted));
        

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
