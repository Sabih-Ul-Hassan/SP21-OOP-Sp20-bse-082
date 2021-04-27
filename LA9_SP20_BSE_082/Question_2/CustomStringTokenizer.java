import java.util.StringTokenizer;
public class CustomStringTokenizer extends StringTokenizer {
    String str;
    public CustomStringTokenizer(String str) {
        super(str); this.str=str;
    }
    @Override
    public int countTokens() {
        String[] s  = str.split(" ");
        int tokken=0;
        for (String x: s ) {
            try {
                Integer.parseInt(x);
            }
            catch (Exception ex) {
                tokken++;
            }
        }
        return tokken;
    }

    @Override
    public String toString() {
        return str;
    }
}
