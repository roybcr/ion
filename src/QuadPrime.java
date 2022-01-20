/**
 * A QuadPrime array is an array that meets the following conditions:
 * ------------------------------------------------------------------
 * 1. The length of the array is a product of 4.
 * 2. All the elements in the array are prime numbers.
 * 3. All quads (groups of 4 adjacent cells starting from 0 - 3, 4 - 7, etc.) 
 * has the exact same elements in some order.
 *  
 * This method gets an array of prime numbers and returns true if it's a QuadPrime array.
 */

public class QuadPrime {

    public static boolean quadPrime(int[] a) {
        if (a.length % 4 != 0) 
            return false;
        return quadPrime(a, 4, a[0] * a[1] * a[2] * a[3]);
    }

    public static boolean quadPrime(int[] a, int i, int mult) {

        if (i == a.length) 
            return true;
        int newMult = a[i] * a[i + 1] * a[i + 2] * a[i + 3];
        return mult == newMult && quadPrime(a, i + 4, newMult);

    }
}
