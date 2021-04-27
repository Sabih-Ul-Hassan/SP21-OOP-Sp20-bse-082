public class Clock {
    private int hrs,mins,secs;
    public int getHrs() {
        return hrs;
    }
    public int getMins() {
        return mins;
    }
    public int getSecs() {
        return secs;
    }
    public Clock(int hrs, int mins, int secs) {
        this.hrs = hrs;
        this.mins = mins;
        this.secs = secs;
    }
    public void display() {
        System.out.println(hrs+":"+mins+":"+secs);
    }
}
