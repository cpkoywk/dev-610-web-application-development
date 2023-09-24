import java.util.ArrayList;
import java.util.Collections;

public class CalendarDate implements Comparable<CalendarDate> {
    private int month;
    private int day;
    private int year;


    public CalendarDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Compares this calendar date to another date.
    // Dates are compared by month and then by day.
    public int compareTo(CalendarDate other) {
        if (year != other.year) {
            return year - other.year;
        } else if (month != other.month) {
            return month - other.month;
        } else {
            return day - other.day;
        }
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        return year + "/" + month + "/" + day;
    }


        public static void main(String[] args) {
            CalendarDate date1 = new CalendarDate(1995, 7, 18);
            CalendarDate date2 = new CalendarDate(2001, 3, 2);
            CalendarDate date3 = new CalendarDate(1995, 7, 18);
    
            System.out.println("Comparing date1 to date2: " + date1.compareTo(date2)); 
            System.out.println("Comparing date2 to date1: " + date2.compareTo(date1)); 
            System.out.println("Comparing date1 to date3: " + date1.compareTo(date3)); 
        }
    }

