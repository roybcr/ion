import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int a1[] = {1};
        int a2[] = {1};
        int b1[] = {9,2,7};
        int b2[] = {2,1,2};
        int c1[] = {0,10, 100};
        int c2[] = {1, 1, 2};
        int d1[] = {45,23, 83};
        int d2[] = {2,2,2};
        int e1[] = {10,2, 8};
        int e2[] = {2,1,2};
        int f1[] = {11329,493, 232};
        int f2[] = {1,3,3};
        int g1[] = {120,11, 8};
        int g2[] = {3,2,1};
        int h1[] = {11329,493, 232};
        int h2[] = {5, 3, 3};

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {1, 1, 1, 3, 3, 3, 1, 1, 1};
        int[] arr3 = {0, 9, 8, 7, 6, 5, 5, 5, 6, 7, 8, 9, 0};
        int[] arr4 = {0, 9, 8, 7, 6, 5, 5, 5, 6, 8, 9, 0, 0};
        int[] arr5 = {45, 32, 3, 52, 92, 72, 5, 12, 73};
        
        double a[] = {1.5, 3, 4.5};
        double b[] = {1.5, 3, 4.5, 2};
        double c[] = { 1.5 };


         
        // Mul
        System.out.println("For call mul(a = " + Arrays.toString(a) + "), result is " + Mul.mul(a));
        System.out.println("For call mul(b = " + Arrays.toString(b) + "), result is " + Mul.mul(b));
        System.out.println("For call mul(c = " + Arrays.toString(c) + "), result is " + Mul.mul(c));

         
        // QuickSort
        System.out.println("For call quickSort(arr = " + Arrays.toString(arr1) + "), result is " + Arrays.toString(QuickSort.quickSort(arr1)));
        System.out.println("For call quickSort(arr = " + Arrays.toString(arr2) + "), result is " + Arrays.toString(QuickSort.quickSort(arr2)));
        System.out.println("For call quickSort(arr = " + Arrays.toString(arr3) + "), result is " + Arrays.toString(QuickSort.quickSort(arr3)));
        System.out.println("For call quickSort(arr = " + Arrays.toString(arr4) + "), result is " + Arrays.toString(QuickSort.quickSort(arr4)));
        System.out.println("For call quickSort(arr = " + Arrays.toString(arr5) + "), result is " + Arrays.toString(QuickSort.quickSort(arr5)));
         
         
        // ReverseArray
        System.out.println("For call reverseArray(arr1 = " + Arrays.toString(arr1) + "), result is arr1 = " + Arrays.toString(ReverseArray.reverseArray(arr1)));
        System.out.println("For call reverseArray(arr2 = " + Arrays.toString(arr2) + "), result is arr2 = " + Arrays.toString(ReverseArray.reverseArray(arr2)));
        System.out.println("For call reverseArray(arr3 = " + Arrays.toString(arr3) + "), result is arr3 = " + Arrays.toString(ReverseArray.reverseArray(arr3)));
        System.out.println("For call reverseArray(arr4 = " + Arrays.toString(arr4) + "), result is arr4 = " + Arrays.toString(ReverseArray.reverseArray(arr4)));
        System.out.println("For call reverseArray(arr5 = " + Arrays.toString(arr5) + "), result is arr5 = " + Arrays.toString(ReverseArray.reverseArray(arr5)));
         
                   
        // DigitTracker  
        System.out.println("For call digitTracker(a1 = " + Arrays.toString(a1) + ", a2 = " + Arrays.toString(a2) + "), result is " + DigitTracker.digitTracker(a1, a2)  + ".\tExpecting: " + true);
        System.out.println("For call digitTracker(b1 = " + Arrays.toString(b1) + ", b2 = " + Arrays.toString(b2) + "), result is " + DigitTracker.digitTracker(b1, b2)  + ".\tExpecting: " + false);
        System.out.println("For call digitTracker(c1 = " + Arrays.toString(c1) + ", c2 = " + Arrays.toString(c2) + "), result is " + DigitTracker.digitTracker(c1, c2)  + ".\tExpecting: " + false);
        System.out.println("For call digitTracker(d1 = " + Arrays.toString(d1) + ", d2 = " + Arrays.toString(d2) + "), result is " + DigitTracker.digitTracker(d1, d2)  + ".\tExpecting: " + true);
        System.out.println("For call digitTracker(e1 = " + Arrays.toString(e1) + ", e2 = " + Arrays.toString(e2) + "), result is " + DigitTracker.digitTracker(e1, e2) + ".\tExpecting: " + false);
        System.out.println("For call digitTracker(f1 = " + Arrays.toString(f1) + ", f2 = " + Arrays.toString(f2) + "), result is " + DigitTracker.digitTracker(f1, f2) + ".\tExpecting: " + false);
        System.out.println("For call digitTracker(g1 = " + Arrays.toString(g1) + ", g2 = " + Arrays.toString(g2) + "), result is " + DigitTracker.digitTracker(g1, g2)  + ".\tExpecting: " + true);
        System.out.println("For call digitTracker(h1 = " + Arrays.toString(h1) + ", h2 = " + Arrays.toString(h2) + "), result is " + DigitTracker.digitTracker(h1, h2)  + ".\tExpecting: " + true);
         

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
}
