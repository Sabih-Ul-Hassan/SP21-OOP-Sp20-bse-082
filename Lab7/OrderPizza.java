package Lab7;

public class OrderPizza {
    private Pizza p1,p2,p3;
    public OrderPizza(Pizza p1){this.p1=p1; }
    public OrderPizza(Pizza p1,Pizza p2){this.p1=p1;this.p2=p2; }
    public OrderPizza(Pizza p1,Pizza p2,Pizza p3){this.p1=p1;this.p2=p2;this.p3=p3; }
    public double calcTotal(){double total=0.0; try{
        total+=p1.calCost();total+=p2.calCost();total+=p3.calCost();
    }
    catch (Exception ex){;}
        return total;
    }
}
