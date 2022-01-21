import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int a1[] = { 1 };
        int a2[] = { 1 };
        int b1[] = { 9, 2, 7 };
        int b2[] = { 2, 1, 2 };
        int c1[] = { 0, 10, 100 };
        int c2[] = { 1, 1, 2 };
        int d1[] = { 45, 23, 83 };
        int d2[] = { 2, 2, 2 };
        int e1[] = { 10, 2, 8 };
        int e2[] = { 2, 1, 2 };
        int f1[] = { 11329, 493, 232 };
        int f2[] = { 1, 3, 3 };
        int g1[] = { 120, 11, 8 };
        int g2[] = { 3, 2, 1 };
        int h1[] = { 11329, 493, 232 };
        int h2[] = { 5, 3, 3 };

        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr2 = { 1, 1, 1, 3, 3, 3, 1, 1, 1 };
        int[] arr3 = { 0, 9, 8, 7, 6, 5, 5, 5, 6, 7, 8, 9, 0 };
        int[] arr4 = { 0, 9, 8, 7, 6, 5, 5, 5, 6, 8, 9, 0, 0 };
        int[] arr5 = { 45, 32, 3, 52, 92, 72, 5, 12, 73 };

        int[] q1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] q2 = { 1, 1, 1, 3, 3, 3, 1, 1, 1 };
        int[] q3 = { 0, 9, 8, 7, 6, 5, 5, 5, 6, 7, 8, 9, 0 };
        int[] q4 = { 0, 9, 8, 7, 6, 5, 5, 5, 6, 8, 9, 0, 0 };
        int[] q5 = { 45, 32, 3, 52, 92, 72, 5, 12, 73 };
        
        int[] r1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] r2 = { 1, 1, 1, 3, 3, 3, 1, 1, 1 };
        int[] r3 = { 0, 9, 8, 7, 6, 5, 5, 5, 6, 7, 8, 9, 0 };
        int[] r4 = { 0, 9, 8, 7, 6, 5, 5, 5, 6, 8, 9, 0, 0 };
        int[] r5 = { 45, 32, 3, 52, 92, 72, 5, 12, 73 };
        
        double a[] = { 1.5, 3, 4.5 };
        double b[] = { 1.5, 3, 4.5, 2 };
        double c[] = {  1.5  };
        
        int k1[] = { -10, -5, 0, 5, 10, 15 };
        int k2[] = { 1, 1, 1, 1, 1, 1, 1, 0 };
        int k3[] = { 8, 6, 4, 6, 4, 2, 0, -2, 0 };
        int k4[] = { 8, 6, 4, 6, 8, 2, 0, -2, 0 };
        int k5[] = { 0, 9 };
        int k6[] = { 0 };

        int[] qP1 = { 3, 7, 11, 19, 19, 7, 11, 3, 11, 3, 19, 7 };
        int[] qP2 = { 3, 7, 11, 19, 3, 19, 11, 3, 11, 3, 19, 7 };
        int[] qP3 = { 3, 7, 11, 19, 13, 19, 11, 3, 11, 3, 19, 7 };
        int[] qP4 = { 3, 7, 11, 19 };
        
        int[][] mm1 = { { 7, 4, 2, 3 }, { 1, 3, 4, 3 }, { 5, 6, 9, 8 } };
        int[][] mm2 = { { 7, 2 }, { 9, 3 } };
        int[][] mm3 = { { 1, -3, 2 } };
        int[][] mm4 = { { 7, 4 }, { 1, 3 }, { 15, 6 } };
 
        
        
        
        // SumNum
        System.out.println("For call sumNum(a = " + Arrays.toString(arr1) + " targetSum = 15), result is " + SumNum.sumNum(arr1, 15));
        System.out.println("For call sumNum(a = " + Arrays.toString(arr1) + " targetSum = 45), result is " + SumNum.sumNum(arr1, 45));
        System.out.println("For call sumNum(a = " + Arrays.toString(arr1) + " targetSum = 46), result is " + SumNum.sumNum(arr1, 46));
        System.out.println("For call sumNum(a = " + Arrays.toString(arr5) + " targetSum = 128), result is " + SumNum.sumNum(arr5, 128));
        System.out.println("For call sumNum(a = " + Arrays.toString(arr5) + " targetSum = 131), result is " + SumNum.sumNum(arr5, 131));
        System.out.println("For call sumNum(a = " + Arrays.toString(arr5) + " targetSum = 241), result is " + SumNum.sumNum(arr5, 241));

        
        // Mul
        System.out.println("For call mul(a = " + Arrays.toString(a) + "), result is " + Mul.mul(a));
        System.out.println("For call mul(b = " + Arrays.toString(b) + "), result is " + Mul.mul(b));
        System.out.println("For call mul(c = " + Arrays.toString(c) + "), result is " + Mul.mul(c));

         
        // QuickSort
        System.out.println("For call quickSort(arr = " + Arrays.toString(q1) + "), result is " + Arrays.toString(QuickSort.quickSort(q1)));
        System.out.println("For call quickSort(arr = " + Arrays.toString(q2) + "), result is " + Arrays.toString(QuickSort.quickSort(q2)));
        System.out.println("For call quickSort(arr = " + Arrays.toString(q3) + "), result is " + Arrays.toString(QuickSort.quickSort(q3)));
        System.out.println("For call quickSort(arr = " + Arrays.toString(q4) + "), result is " + Arrays.toString(QuickSort.quickSort(q4)));
        System.out.println("For call quickSort(arr = " + Arrays.toString(q5) + "), result is " + Arrays.toString(QuickSort.quickSort(q5)));
         
         
        // ReverseArray
        System.out.println("For call reverseArray(r1 = " + Arrays.toString(r1) + "), result is r1 = " + Arrays.toString(ReverseArray.reverseArray(r1)));
        System.out.println("For call reverseArray(r2 = " + Arrays.toString(r2) + "), result is r2 = " + Arrays.toString(ReverseArray.reverseArray(r2)));
        System.out.println("For call reverseArray(r3 = " + Arrays.toString(r3) + "), result is r3 = " + Arrays.toString(ReverseArray.reverseArray(r3)));
        System.out.println("For call reverseArray(r4 = " + Arrays.toString(r4) + "), result is r4 = " + Arrays.toString(ReverseArray.reverseArray(r4)));
        System.out.println("For call reverseArray(r5 = " + Arrays.toString(r5) + "), result is r5 = " + Arrays.toString(ReverseArray.reverseArray(r5)));
        
                   
        // DigitTracker  
        System.out.println("For call digitTracker(a1 = " + Arrays.toString(a1) + ", a2 = " + Arrays.toString(a2) + "), result is " + DigitTracker.digitTracker(a1, a2)  + ".\tExpecting: " + true);
        System.out.println("For call digitTracker(b1 = " + Arrays.toString(b1) + ", b2 = " + Arrays.toString(b2) + "), result is " + DigitTracker.digitTracker(b1, b2)  + ".\tExpecting: " + false);
        System.out.println("For call digitTracker(c1 = " + Arrays.toString(c1) + ", c2 = " + Arrays.toString(c2) + "), result is " + DigitTracker.digitTracker(c1, c2)  + ".\tExpecting: " + false);
        System.out.println("For call digitTracker(d1 = " + Arrays.toString(d1) + ", d2 = " + Arrays.toString(d2) + "), result is " + DigitTracker.digitTracker(d1, d2)  + ".\tExpecting: " + true);
        System.out.println("For call digitTracker(e1 = " + Arrays.toString(e1) + ", e2 = " + Arrays.toString(e2) + "), result is " + DigitTracker.digitTracker(e1, e2) + ".\tExpecting: " + false);
        System.out.println("For call digitTracker(f1 = " + Arrays.toString(f1) + ", f2 = " + Arrays.toString(f2) + "), result is " + DigitTracker.digitTracker(f1, f2) + ".\tExpecting: " + false);
        System.out.println("For call digitTracker(g1 = " + Arrays.toString(g1) + ", g2 = " + Arrays.toString(g2) + "), result is " + DigitTracker.digitTracker(g1, g2)  + ".\tExpecting: " + true);
        System.out.println("For call digitTracker(h1 = " + Arrays.toString(h1) + ", h2 = " + Arrays.toString(h2) + "), result is " + DigitTracker.digitTracker(h1, h2)  + ".\tExpecting: " + true);
         

        // KArray
        System.out.println("For call kArray(arr = " + Arrays.toString(k1) + "), result is " + KArray.kArray(k1) + ".\tExpecting: " + true);
        System.out.println("For call kArray(arr = " + Arrays.toString(k2) + "), result is " + KArray.kArray(k2) + ".\tExpecting: " + false);
        System.out.println("For call kArray(arr = " + Arrays.toString(k3) + "), result is " + KArray.kArray(k3) + ".\tExpecting: " + true);
        System.out.println("For call kArray(arr = " + Arrays.toString(k4) + "), result is " + KArray.kArray(k4) + ".\tExpecting: " + false);
        System.out.println("For call kArray(arr = " + Arrays.toString(k5) + "), result is " + KArray.kArray(k5) + ".\tExpecting: " + true);
        System.out.println("For call kArray(arr = " + Arrays.toString(k6) + "), result is " + KArray.kArray(k6) + ".\tExpecting: " + true);


        // Smallest
        System.out.println("For call smallest(arr = " + Arrays.toString(k1) + "), result is " + Smallest.smallest(k1) + ".\tExpecting: " + 0);
        System.out.println("For call smallest(arr = " + Arrays.toString(k2) + "), result is " + Smallest.smallest(k2) + ".\tExpecting: " + 7);
        System.out.println("For call smallest(arr = " + Arrays.toString(k3) + "), result is " + Smallest.smallest(k3) + ".\tExpecting: " + 7);
        System.out.println("For call smallest(arr = " + Arrays.toString(k4) + "), result is " + Smallest.smallest(k4) + ".\tExpecting: " + 7);
        System.out.println("For call smallest(arr = " + Arrays.toString(k5) + "), result is " + Smallest.smallest(k5) + ".\tExpecting: " + 0);
        System.out.println("For call smallest(arr = " + Arrays.toString(k6) + "), result is " + Smallest.smallest(k6) + ".\tExpecting: " + 0);

        
        // MaxEven
        System.out.println("For call maxEven(arr1 = " + Arrays.toString(arr1) + "), result is " + MaxEven.maxEven(arr1));
        System.out.println("For call maxEven(arr2 = " + Arrays.toString(arr2) + "), result is " + MaxEven.maxEven(arr2));
        System.out.println("For call maxEven(arr3 = " + Arrays.toString(arr3) + "), result is " + MaxEven.maxEven(arr3));
        System.out.println("For call maxEven(arr4 = " + Arrays.toString(arr4) + "), result is " + MaxEven.maxEven(arr4));
        System.out.println("For call maxEven(arr5 = " + Arrays.toString(arr5) + "), result is " + MaxEven.maxEven(arr5));
        

        // TwoAscendingArray
        System.out.println("For call twoAscending(arr1 = " + Arrays.toString(arr1) + "), result is " + TwoAscendingArray.twoAscending(arr1));
        System.out.println("For call twoAscending(arr2 = " + Arrays.toString(arr2) + "), result is " + TwoAscendingArray.twoAscending(arr2));
        System.out.println("For call twoAscending(arr3 = " + Arrays.toString(arr3) + "), result is " + TwoAscendingArray.twoAscending(arr3));
        System.out.println("For call twoAscending(arr4 = " + Arrays.toString(arr4) + "), result is " + TwoAscendingArray.twoAscending(arr4));
        System.out.println("For call twoAscending(arr5 = " + Arrays.toString(arr5) + "), result is " + TwoAscendingArray.twoAscending(arr5));


        // ZigZag
        System.out.println("For call zigZag(arr1 = " + Arrays.toString(arr1) + "), result is " + ZigZag.zigzag(arr1));
        System.out.println("For call zigZag(arr2 = " + Arrays.toString(arr2) + "), result is " + ZigZag.zigzag(arr2));
        System.out.println("For call zigZag(arr3 = " + Arrays.toString(arr3) + "), result is " + ZigZag.zigzag(arr3));
        System.out.println("For call zigZag(arr4 = " + Arrays.toString(arr4) + "), result is " + ZigZag.zigzag(arr4));
        System.out.println("For call zigZag(arr5 = " + Arrays.toString(arr5) + "), result is " + ZigZag.zigzag(arr5));


        // QuadPrime
        System.out.println("For call quadPrime(qP1 = " + Arrays.toString(qP1) + "), result is " + QuadPrime.quadPrime(qP1));
        System.out.println("For call quadPrime(qP2 = " + Arrays.toString(qP2) + "), result is " + QuadPrime.quadPrime(qP2));
        System.out.println("For call quadPrime(qP3 = " + Arrays.toString(qP3) + "), result is " + QuadPrime.quadPrime(qP3));
        System.out.println("For call quadPrime(qP4 = " + Arrays.toString(qP4) + "), result is " + QuadPrime.quadPrime(qP4));

        
        // MatMax
        System.out.println("For call matMax(mm1), result is " + MatMax.matMax(mm1)); App.print2DArray(mm1);
        System.out.println("For call matMax(mm2), result is " + MatMax.matMax(mm2)); App.print2DArray(mm2);
        System.out.println("For call matMax(mm3), result is " + MatMax.matMax(mm3)); App.print2DArray(mm3);
        System.out.println("For call matMax(mm4), result is " + MatMax.matMax(mm4)); App.print2DArray(mm4);
        
        
        // Palindrome
        System.out.println(Palindrome.isPalindrome(arr1));
        System.out.println(Palindrome.isPalindrome(arr2));
        System.out.println(Palindrome.isPalindrome(arr3));
        System.out.println(Palindrome.isPalindrome(arr4));
        System.out.println(Palindrome.isPalindrome("racecar"));
        System.out.println(Palindrome.isPalindrome("whosthere"));
        System.out.println(Palindrome.isPalindrome("encyclopedia"));
        System.out.println(Palindrome.isPalindrome("wasItaCarOraCatIsaw"));


        // ReverseString
        System.out.println(Strings.reverseString("racecar"));
        System.out.println(Strings.reverseString("whosthere"));
        System.out.println(Strings.reverseString("encyclopedia"));
        System.out.println(Strings.reverseString("wasItaCarOraCatIsaw"));


         // LexicographicOrder
        System.out.println("For call lexicographicOrder(\"abcd\", \"abcd\"), result is " +  LexicographicOrder.lexicographicOrder("abcd", "abcd"));
        System.out.println("For call lexicographicOrder(\"abcd\", \"abc\"), result is " +  LexicographicOrder.lexicographicOrder("abcd", "abc"));
        System.out.println("For call lexicographicOrder(\"abc\", \"abd\"), result is " +  LexicographicOrder.lexicographicOrder("abc", "abd"));
        System.out.println("For call lexicographicOrder(\"txy\", \"gh\"), result is " +  LexicographicOrder.lexicographicOrder("txy", "gh"));
        System.out.println("For call lexicographicOrder(\"\", \"a\"), result is " +  LexicographicOrder.lexicographicOrder("", "a"));


        // UpString
        System.out.println("For call upString(\"bddfhijj\"), result is " + UpString.upString("bddfhijj"));
        System.out.println("For call upString(\"bddfhdjj\"), result is " + UpString.upString("bddfhdjj"));
        System.out.println("For call upString(\"dca\"), result is " + UpString.upString("dca"));
        System.out.println("For call upString(\"d\"), result is " + UpString.upString("d"));
        System.out.println("For call upString(\"\"), result is " + UpString.upString(""));
        

        // IsStringOK
        System.out.println("For call isStringOk(\"abcAbc\"), result is " + IsStringOK.isStringOK("abcAbc"));
        System.out.println("For call isStringOk(\"ab78\"), result is " + IsStringOK.isStringOK("ab78"));
        System.out.println("For call isStringOk(\"785\"), result is " + IsStringOK.isStringOK("785"));
    }
    
    private static void print2DArray(int[][] _2DArray) {
        for (int i = 0; i < _2DArray.length; i++) {
            System.out.println(Arrays.toString(_2DArray[i]));
        }
        
        System.out.println();
    }
}
