package learnathon.batch15.day7.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatterDemo {
	public static void main(String[] args) {
				Date unformatted = new Date();
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YY hh:mm:ss ms");
				System.out.println(unformatted); 
				String formatted = formatter.format(unformatted);
				System.out.println(formatted); 
				
				
				SimpleDateFormat f2 = new SimpleDateFormat("G YY/MM/dd kk z");
				System.out.println(f2.format(unformatted));
				
				SimpleDateFormat f3 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
				
				String strDate = "08/11/2019 06:23:23";
				
				try {
					Date d = f3.parse(strDate);
					System.out.println(f2.format(d));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	}
}
