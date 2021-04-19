package Lab8;
public class tape  extends  Publication{
    private int playingTime;
    public tape(String title, int price, int playingTime) {
        super(title, price);
        this.playingTime = playingTime;
    }
    public tape() {}
    public int getPlayingTime() {
        return playingTime;
    }
    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }
    public void display() {
        System.out.println("tape: " +
                super.toString()+" "+
                "playingTime= " + playingTime );
    }
}
