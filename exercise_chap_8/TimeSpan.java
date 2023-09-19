public class TimeSpan {
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
        TimeSpan t=new TimeSpan(5,23,33);
        System.out.println(t.hours+":"+t.minutes+":"+t.seconds);

        TimeSpan addT = new TimeSpan(2, 40, 30);
        t.add(addT);
        System.out.println(t.hours+":"+t.minutes+":"+t.seconds);
        System.out.println("e8q8:");
        TimeSpan t2=new TimeSpan(5,23,33);
        System.out.println(t2.hours+":"+t2.minutes+":"+t2.seconds);
        TimeSpan minusT = new TimeSpan(2, 40, 30);
        t2.subtract(minusT);
        System.out.println(t2.hours+":"+t2.minutes+":"+t2.seconds);
        System.out.println("e8q9:");
        TimeSpan t3=new TimeSpan(1,45,0);
        System.out.println(t3.hours+":"+t3.minutes+":"+t3.seconds);
        t3.scale(2);
        System.out.println(t3.hours+":"+t3.minutes+":"+t3.seconds);




    }}