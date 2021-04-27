package lab9;

import java.util.StringTokenizer;

public class Asign2_RUNNER {
    public static void main(String[] args) {

        CustomStringTokenizer x = new CustomStringTokenizer("string aint it 3");
        System.out.println("\""+x+"\"'s tokken count is "+x.countTokens());
        CustomStringTokenizer x1 = new CustomStringTokenizer("string aint it ok");
        System.out.println("\""+x1+"\"'s tokken count is "+x1.countTokens());
      }
}
