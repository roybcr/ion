/**
 * This method takes two strings s1 and s2, and recursively merges them by adding
 * letters in alternating order, starting with s1.
 *
 */

public class TwoAlternateStrings {
    public static String twoAlternateStrings(String s1, String s2) {
        if (s1.length() == 0 && s2.length() == 0) 
            return "";
        if (s1.length() == 0) 
            return s2;
        if (s2.length() == 0) 
            return s1;
        return s1.charAt(0) + "" + s2.charAt(0) + "" + twoAlternateStrings(
            s1.substring(1),
            s2.substring(1)
        );
    }
}