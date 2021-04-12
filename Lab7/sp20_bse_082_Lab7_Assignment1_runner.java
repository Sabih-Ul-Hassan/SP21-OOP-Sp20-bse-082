package Lab7;
public class sp20_bse_082_Lab7_Assignment1_runner {
    public static void main(String[] args) {
    Pizza p1 = new Pizza('L',4,1,2);
    Pizza p2 = new Pizza('S',1,3,1);
    Pizza p3 = new Pizza('m',2,2,5);
    Pizza p4 = new Pizza('l',1,1,2);
    System.out.println("p1: "+p1.getDescription());
    System.out.println("p2: "+p2.getDescription());
    System.out.println("p3: "+p3.getDescription());
    System.out.println("p4: "+p4.getDescription()+". Price:"+p4.calCost());
    OrderPizza order = new OrderPizza(p2,p3);
    System.out.println(order.calcTotal());
    }
}
