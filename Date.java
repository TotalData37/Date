//Date.java - This program shows 3 instance variables - Month, Date, year and a Constructor to initializes the three instance variables.
//CSIS 212-B02
//No external citations used

package date;

public class Date {

	    // instance variables
	    private int month;
	    private int day;
	    private int year;

	    // Constructor to set the date
	    public Date(int month, int day, int year) {
	        this.month = month;
	        this.day = day;
	        this.year = year;
	    }

	    // Set and get for Month
	    public void setMonth(int month) {
	        this.month = month;
	    }

	    public int getMonth() {
	        return month;
	    }

	    // Set and get for day
	    public void setDay(int day) {
	        this.day = day;
	    }

	    public int getDay() {
	        return day;
	    }

	    // Set and get for year
	    public void setYear(int year) {
	        this.year = year;
	    }

	    public int getYear() {
	        return year;
	    }

	    // Method of display 
	    public void displayDate() {
	        System.out.printf("%d/%d/%d%n", month, day, year);
	    } 
	} // End of Class Date