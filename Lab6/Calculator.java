package Lab6;

public class Calculator {

    static double sum(double a, double b){ return a+b;}
    static double multiply(double a, double b){ return a*b;}
    static double divide(double a, double b){
        try {
        return a / b;
    } catch (Exception ex){
        System.out.println("Cant divide by 0");
    } return a/0.0; // both numbers are float, so NAN will be returned
    }
    static double modulus(double a, double b){return a%b;}
    static double sin(double a){return Math.sin(a);}
    static double cos(double a){return Math.cos(a);}
    static double tan(double a){return Math.tan(a);}

}
