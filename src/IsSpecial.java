/**
 *
 * Is-Special
 *
 * A recursive method that checks if a given integer is special.
 * An integer is considered to be "special" by making it through the following process:
 *
 * 1. Start with Steps = 2.
 * 2. For all integers from 1 up to |n|: 1,2,3,4,5,6,...,n:
 * 3. Delete all numbers in positions that are divisible by Steps.
 * 4. Unless n is deleted, increment Steps by 1 then repeat step 3.
 * 5. The process is over if n is deleted (not special), or if Steps > n (special).
 *
 * @param n An Integer to find out if special or not.
 * @return  True or False indicating whether or not the checked number is special.
 *
 */

public class IsSpecial {

    public static boolean isSpecial(int n) {

        /* In case n is less than 0 */
        int num = n < 0 ? (n * -1) - 1 : n;

        if (num % 2 == 0 || num % 5 == 0 || num % 4 == 0) 
            return false;
        
        /* Starting straight from the second round, with a new position of n,
        equals to the initial position, minus all the even numbers before it. */
        int newPosition = (num + 1) / 2;

        /* Jumps of 3 now since we've already eliminated all even numbers. */
        int jumpSteps = 3;
        return isSpecial(newPosition, jumpSteps);
    }

    private static boolean isSpecial(int n, int jumpSteps) {

        /* If current position is divisible by jumpSteps,
        our number is not special and is going to be eliminated in the current round. */
        if (n % jumpSteps == 0) 
            return false;
        
        /* If steps are bigger than the current position,
        our number will never be eliminated and thus, special. */
        if (n < jumpSteps) 
            return true;
        
        /* Promote n to its new position by eliminating all unspecial numbers before it.
        Increase jumpSteps by one. */

        return isSpecial((n - (n / jumpSteps)), jumpSteps + 1);
    }
}
