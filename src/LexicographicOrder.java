/**
 * Compare two Strings lexicographic order.
 * Return 1 if the first String's lexicographic order is bigger than the second String.
 * Return -1 if the opposite is true.
 * Return 0 if the two Strings are identical.
 */

public class LexicographicOrder {

    public static int lexicographicOrder(String s1, String s2) {

        if (s1.equals(s2)) 
            return 0;
        
        if (s1.length() == 0 && s2.length() > 0) 
            return 1;
        
        if (s2.length() == 0 && s1.length() > 0) 
            return -1;
        
        if (s1.charAt(0) == s2.charAt(0)) 
            return lexicographicOrder(s1.substring(1), s2.substring(1));
        
        return s1.charAt(0) < s2.charAt(0) ? 1 : -1;

    }
}
