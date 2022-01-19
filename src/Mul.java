public class Mul {

    public static double mul(double[] a) {
        return mul(a, 0);
    }

    public static double mul(double[] a, int i) {

        if (i == a.length) 
            return 1;
        
        return a[i++] * mul(a, i);
    }
}
