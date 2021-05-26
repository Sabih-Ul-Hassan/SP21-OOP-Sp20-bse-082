package lab11;

public class Triangle  implements Shape{
    private int a,b,c;
    private float s;
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        s=(a+b+c)/2;
    }

    @Override
    public double area() {
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
