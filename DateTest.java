//DateTest.java - This program shows 3 instance variables - Month, Date, year from Date.java and display it and update date.
//CSIS 212-B02
//No external citations used
package date;

public class DateTest {

		// Main method beings execution of Java application
	    public static void main(String[] args) {

	        // Date object with original values
	        Date myDate = new Date(6, 17, 2025);

	        // Original date
	        System.out.print("Original date: ");
	        myDate.displayDate();

	        // updated values using set method
	        myDate.setMonth(6);
	        myDate.setDay(23);
	        myDate.setYear(2025);

	        // Display updated date
	        System.out.print("Updated date: ");
	        myDate.displayDate();
	        System.out.println("David Lyman – Assignment 6\n");
	    } // End of Main Method
	} // End of Public Class DateTest
