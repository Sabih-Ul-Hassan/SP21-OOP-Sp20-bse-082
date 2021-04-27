import lab9.Clock;

public class ChildExtended extends Clock {
    public ChildExtended(int hrs, int mins, int secs) {
        super(hrs, mins, secs);
    }
    public void display() {
        if(getHrs()>11)
            if(getHrs()==12)
                System.out.println((getHrs())+":"+getMins()+":"+getSecs()+" PM");
            else System.out.println((getHrs()-12)+":"+getMins()+":"+getSecs()+" PM");
        else
            System.out.println((getHrs())+":"+getMins()+":"+getSecs()+" AM");
        super.display();
    }
}
