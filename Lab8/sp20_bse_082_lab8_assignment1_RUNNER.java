package Lab8;
import java.util.Scanner;
public class sp20_bse_082_lab8_assignment1_RUNNER {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book b1= new Book();
        tape t1 = new tape();
        System.out.println("Enter title of the tape");
        t1.setTitle(input.nextLine());
        System.out.println("Enter title of the book");
        b1.setTitle(input.nextLine());
        System.out.println("Enter price of the tape");
        t1.setPrice(input.nextInt());
        System.out.println("Enter price of the book");
        b1.setPrice(input.nextInt());
        System.out.println("Enter playing time of the tape in minutes ");
        t1.setPlayingTime(input.nextInt());
        System.out.println("Enter number of pages  of the book");
        b1.setPageCount(input.nextInt());
        b1.display();
        t1.display();
    }}
