package BasicJava;
import java.util.Date;

public class CompareDates {
	 
	  public static void main(String[] args) {
	   
	    //create first date object
	    Date d1 = new Date();
	    System.out.println("First Date : " + d1);
	    
	    //make interval of 10 millisecond before creating second date object    
	    try{
	      Thread.sleep(1000);
	    }catch(Exception e){
	    }
	   
	   
	    //create second date object
	    Date d2 = new Date();
	   
	    //use boolean after(Date anotherDate) method of Date Class to
	    //check whether a date is after the specified date
	   
	    
	    System.out.println("Second Date : " + d2);
	    System.out.println("Is second date after first ? : " + d2.after(d1));    
	 
	  }
	
}
