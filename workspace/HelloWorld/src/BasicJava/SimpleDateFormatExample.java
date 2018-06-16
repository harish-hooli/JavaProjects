package BasicJava;

import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDateFormatExample {
	public static void main (String[] args){
		Date dt = new Date();
		
		String DATE_FORMAT = "MM/dd/YY";
		
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		
		System.out.println("date in the format is " + sdf.format(dt));
		
		
	}

}
