public class Palindrome {

    public static boolean isPalindrome(int[] arr) {
        return isPalindrome(arr, 0);
    }

    public static boolean isPalindrome(int[] arr, int i) {
        return (i >= arr.length / 2) ? (arr[i] == arr[arr.length - i]) : (
            arr[i] == arr[arr.length - i++ - 1] && isPalindrome(arr, i)
        );
    }

    public static boolean isPalindrome(String s) {
        return (s.length() <= 3) ? (s.charAt(0) == s.charAt(s.length() - 1)) : (
            s.charAt(0) == s.charAt(s.length() - 1) && isPalindrome(s.substring(1, s.length() - 1))
        );
    }
}
