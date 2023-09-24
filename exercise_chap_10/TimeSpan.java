//e10q20
public class TimeSpan implements Comparable<TimeSpan>  {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Mutator method to add a TimeSpan to the current TimeSpan
    public void add(TimeSpan span) {
        this.seconds += span.seconds;
        this.minutes += span.minutes;
        this.hours += span.hours;

        if (this.seconds >= 60) {
            this.seconds -= 60;
            this.minutes++;
        }
        if (this.minutes >= 60) {
            this.minutes -= 60;
            this.hours++;
        }
    }

    @Override
    public int compareTo(TimeSpan other) {
        // Calculate the total number of seconds for this TimeSpan
        int totalSecondsThis = this.hours * 3600 + this.minutes * 60 + this.seconds;
        
        // Calculate the total number of seconds for the other TimeSpan
        int totalSecondsOther = other.hours * 3600 + other.minutes * 60 + other.seconds;
        
        // Compare by the total number of seconds
        return Integer.compare(totalSecondsThis, totalSecondsOther);
    }
    
    public void subtract(TimeSpan span){
        int totalSeconds=3600*this.hours+60*this.minutes+this.seconds;
        int newTotalSeconds=totalSeconds-3600*span.hours-60*span.minutes-span.seconds;
        int newHours=newTotalSeconds/3600;
        int newMinutes=(newTotalSeconds-3600*newHours)/60;
        int newSeconds=(newTotalSeconds-3600*newHours-60*newMinutes);
        this.hours=newHours;
        this.minutes=newMinutes;
        this.seconds=newSeconds;

    }
    public void scale(int factor){
        int totalSeconds=3600*this.hours+60*this.minutes+this.seconds;
        int newTotalSeconds=totalSeconds*factor;
        int newHours=newTotalSeconds/3600;
        int newMinutes=(newTotalSeconds-3600*newHours)/60;
        int newSeconds=(newTotalSeconds-3600*newHours-60*newMinutes);
        this.hours=newHours;
        this.minutes=newMinutes;
        this.seconds=newSeconds;

    }


    public static void main(String[] args) {

        System.out.println("e8q7:");
        TimeSpan t1=new TimeSpan(5,23,33);
        
        TimeSpan t2=new TimeSpan(5,23,33);
    
        TimeSpan t3=new TimeSpan(1,45,0);
        // Compare t1 and t2
        int result1 = t1.compareTo(t2);
        System.out.println("t1.compareTo(t2): " + result1);

        // Compare t2 and t3
        int result2 = t2.compareTo(t3);
        System.out.println("t2.compareTo(t3): " + result2);

        // Compare t1 and t3
        int result3 = t1.compareTo(t3);
        System.out.println("t1.compareTo(t3): " + result3);
    }




    }