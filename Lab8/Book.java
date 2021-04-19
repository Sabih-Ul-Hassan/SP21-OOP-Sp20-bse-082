package Lab8;
public class Book extends Publication{
    private int pageCount;
    public Book() {}
    public Book(String title, int price, int pageCount) {
        super(title, price);
        this.pageCount = pageCount;
    }
    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public void display() {
        System.out.println("Book: " +
                super.toString() +" "+
                "pageCount= " + pageCount) ;
    }
}
