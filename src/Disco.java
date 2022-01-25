public class Disco {
    
    public static boolean disco(boolean[] a, boolean[] b, int i) {
        if (equalArrays(a, b, 0))
            return true;
        if (i == a.length) 
            return false;
        press(a, i);
        if (disco(a, b, i + 1))
            return true;
        press(a, i);
        return disco(a, b, i + 1);
    }

    private static void press(boolean[] a, int i) {
        a[i] = !a[i];
        if (i > 0) 
            a[i - 1] = !a[i - 1];
        if (i < a.length - 1) 
            a[i + 1] = !a[i + 1];
    }

    public static boolean equalArrays(boolean[] a, boolean[] b, int i) {
        if (i == a.length)
            return true;
        if (a[i] != b[i])
            return false;
        return equalArrays(a, b, i + 1);
    }
    
}