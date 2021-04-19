package Lab8;
public class Publication {
    private String title;
    private int price;
    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", price=" + price
               ;
    }
    public Publication() {}
    public Publication(String title, int price) {
        this.title = title;
        this.price = price;
   }
    public String getTitle() {
        return title;
    }
    public int getPrice() {
        return price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void display() {
        System.out.println("Publication: " +
                "title='" + title + '\'' +
                ", price=" + price +"\n");
    }
}
