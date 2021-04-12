package Lab7;

public class Pizza {
    private char size;
    private int cheeseToppings,pepperoniToppings,hamToppings;
    public Pizza(char size,int cheeseToppings,int pepperoniToppings,int hamToppings){
        if(validate(size)) this.size=size; else this.size='S';
        this.cheeseToppings= cheeseToppings;
        this.pepperoniToppings=pepperoniToppings;
        this.hamToppings=hamToppings;
    }
    public Pizza(){cheeseToppings=1;pepperoniToppings=1;hamToppings=2; size='S';}
    public int getPepperoniToppings() {return pepperoniToppings;}
    public int getHamToppings() {return hamToppings;}
    public int getCheeseToppings() {return cheeseToppings;}
    public char getSize() {   return size;    }
    public void setPepperoniToppings(int pepperoniToppings) {this.pepperoniToppings = pepperoniToppings;}
    public void setSize(char size) {if(validate(size)) this.size=size; else this.size='S'; }
    public void setHamToppings(int hamToppings) {this.hamToppings = hamToppings;  }
    public void setCheeseToppings(int cheeseToppings) {this.cheeseToppings = cheeseToppings;}
    public String getDescription(){
        return "Size of pizza: "+size+", no of cheese toppings: "+cheeseToppings+", no of pepperoniToppings:"+pepperoniToppings+", no of ham topping: "+hamToppings;
    }
    private boolean validate(char size ){if(size=='M'||size=='m'||size=='S'||size=='s'||size=='L'||size=='l') return true;
    else return false;}
    public Double calCost(){
        int cost=0;
        switch (size){
            case 'S': case 's': {cost = 10; break;}
            case 'M': case 'm': {cost = 12; break;}
            case 'L': case 'l': {cost = 14; break;}
        }
        cost += hamToppings*2 + cheeseToppings*2 + pepperoniToppings*2 ;
        return (double) cost;
    }

}
