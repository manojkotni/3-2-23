package snippet;

import java.time.LocalDate;
import java.time.Month;

public class birthdaymessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // declare variables for birthday
	    int birthDate = 3;
	    Month birthMonth = Month.APRIL;

	    // get current date
	    LocalDate currentDate = LocalDate.now();
	    System.out.println("Todays Date: " + currentDate);

	    // get current date and month
	    int date = currentDate.getDayOfMonth();
	    Month month = currentDate.getMonth();

	    if(date == birthDate && month == birthMonth) {
	      System.out.println("HAPPY BIRTHDAY TO YOU !!");
	    }
	    else {
	      System.out.println("Today is not my birthday.");
	    }

	}

}
