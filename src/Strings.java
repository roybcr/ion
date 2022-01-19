public class Strings {
    public static String reverseString(String str) {
        return str.length() == 0 ? "" : reverseString(str.substring(1)) + str.charAt(0);
    }
}
