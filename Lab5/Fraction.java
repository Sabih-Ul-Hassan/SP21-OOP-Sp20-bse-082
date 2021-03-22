import java.util.Objects;

public class Fraction {
    private int n1;
    private int n2;
    Fraction(){}
    Fraction(int first_number, int second_number){
        n1=first_number;
        n2=second_number;
    }
    public int[] calculateFractions(){
        int commonDivisor=1;

        for (int i = 2; i<=n1 && i<=n2 ; i++) {
            if(n1%i==0 && n2%i==0)
            {commonDivisor=i; }
        }
        return new int[] {n1/commonDivisor,n2/commonDivisor};

    }
    public void setN1(int n1) {
        this.n1 = n1;
    }
    public void setN2(int n2) {
        this.n2 = n2;
    }
    public int getN2() {
        return n2;
    }
    public int getN1() {
        return n1;
    }
    public boolean equals(Fraction o) {
        int[] o1 = calculateFractions();
        int[] o2 = o.calculateFractions();
        if(o1[0]==o2[0] && o1[1]==o2[1]) return true;
        else return false;
    }
    public void display() {
        int[] o1 = calculateFractions();
        System.out.println(o1[0]+":"+o1[1]);
    }
}
