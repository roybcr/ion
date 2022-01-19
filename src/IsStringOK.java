/**
 * Recursively check wheter a String contains only
 * numbers or only letters.
 */

public class IsStringOK {

    public static boolean isStringOK(String str) {
        return allLetters(str) || allNumbers(str);
    }

    private static boolean allLetters(String str) {
        if (str.length() == 1) 
            return !allNumbers(str);
        return !allNumbers("" + str.charAt(0)) && allLetters(str.substring(1));
    }

    private static boolean allNumbers(String str) {

        if (str.equals("")) 
            return true;
        
        switch (str.charAt(0)) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return true && allNumbers(str.substring(1));
            default:
                return false;
        }
    }

}
