/**
 * upString is a recursive method that checks if a string's characters 
 * are ordered in an ascending order.
 */

public class UpString {
    public static boolean upString(String s) {
        if (s.length() <= 1) 
            return true;
        return s.charAt(1) >= s.charAt(0) && upString(s.substring(1));
    }
}
