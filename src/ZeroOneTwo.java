public class ZeroOneTwo {

    public static boolean zeroOneTwo(int[] a, int[] pattern) {
        if (pattern.length == 0) 
            return true;
        return zeroOneTwo(a, pattern, 0, 0);
    }

    public static boolean zeroOneTwo(int[] a, int[] pattern, int i, int j) {

        if (j == pattern.length) {
            return true;
        }

        if (i == a.length) {
            return false;
        }

        if ((a[i] < 0 || a[i] > 99) || (pattern[j] == 1 && a[i] > 9) || (pattern[j] == 2 && a[i] < 10)) {
            return zeroOneTwo(a, pattern, i + 1, 0);
        }

        return zeroOneTwo(a, pattern, i + 1, j + 1);
    }
}
