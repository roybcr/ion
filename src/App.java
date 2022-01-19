import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {1, 1, 1, 3, 3, 3, 1, 1, 1};
        int[] arr3 = {0, 9, 8, 7, 6, 5, 5, 5, 6, 7, 8, 9, 0};
        int[] arr4 = {0, 9, 8, 7, 6, 5, 5, 5, 6, 8, 9, 0, 0};

        // Palindrome
        System.out.println(Palindrome.isPalindrome(arr1));
        System.out.println(Palindrome.isPalindrome(arr2));
        System.out.println(Palindrome.isPalindrome(arr3));
        System.out.println(Palindrome.isPalindrome(arr4));
        System.out.println(Palindrome.isPalindrome("wasItaCarOraCatIsaw"));
        System.out.println(Palindrome.isPalindrome("encyclopedia"));
        System.out.println(Palindrome.isPalindrome("whosthere"));
        System.out.println(Palindrome.isPalindrome("racecar"));


        // ReverseString
        System.out.println(Strings.reverseString("racecar"));
        System.out.println(Strings.reverseString("whosthere"));
        System.out.println(Strings.reverseString("encyclopedia"));
        System.out.println(Strings.reverseString("wasItaCarOraCatIsaw"));


        // Mul
        double a[] = {1.5, 3, 4.5};
        double b[] = {1.5, 3, 4.5, 2};
        double c[] = {1.5};

        System.out.println("For call mul(b = [1.5, 3, 4.5, 2]), result is " + Mul.mul(b));
        System.out.println("For call mul(a = [1.5, 3, 4.5]), result is " + Mul.mul(a));
        System.out.println("For call mul(c = [1.5]), result is " + Mul.mul(c));


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


        // LexicographicOrder
        System.out.println("For call lexicographicOrder(\"abcd\", \"abcd\"), result is " +  LexicographicOrder.lexicographicOrder("abcd", "abcd"));
        System.out.println("For call lexicographicOrder(\"abcd\", \"abc\"), result is " +  LexicographicOrder.lexicographicOrder("abcd", "abc"));
        System.out.println("For call lexicographicOrder(\"abc\", \"abd\"), result is " +  LexicographicOrder.lexicographicOrder("abc", "abd"));
        System.out.println("For call lexicographicOrder(\"txy\", \"gh\"), result is " +  LexicographicOrder.lexicographicOrder("txy", "gh"));
        System.out.println("For call lexicographicOrder(\"\", \"a\"), result is " +  LexicographicOrder.lexicographicOrder("", "a"));
        

        // ReverseArray
        System.out.println("For call reverseArray(arr1 = [1, 2, 3, 4, 5, 6, 7, 8, 9]), result is arr1 = " + Arrays.toString(ReverseArray.reverseArray(arr1)));
        System.out.println("For call reverseArray(arr2 = [1, 1, 1, 3, 3, 3, 1, 1, 1]), result is arr2 = " + Arrays.toString(ReverseArray.reverseArray(arr2)));
        System.out.println("For call reverseArray(arr3 = [0, 9, 8, 7, 6, 5, 5, 5, 6, 7, 8, 9, 0]), result is arr3 = " + Arrays.toString(ReverseArray.reverseArray(arr3)));
        System.out.println("For call reverseArray(arr4 = [0, 9, 8, 7, 6, 5, 5, 5, 6, 8, 9, 0, 0]), result is arr4 = " + Arrays.toString(ReverseArray.reverseArray(arr4)));

    }
}
