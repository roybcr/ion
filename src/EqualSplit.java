public class EqualSplit {

    public static boolean equalSplit(int[] arr) {
        
        if (arr.length % 2 != 0 || arr.length < 2) 
            return false;

        if (arr.length == 2) 
            return arr[0] == arr[1];

        int sum = sum(arr, 0);
        if (sum % 2 != 0) 
            return false;

        return equalSplit(arr, 0, sum / 2, 0);
    }

    private static boolean equalSplit(int[] arr, int i, int sum, int count) {

        if (count >= arr.length / 2) 
            return sum == 0;
        
        if (arr.length - i == arr.length / 2 - count)
            return equalSplit(arr, i + 1, sum - arr[i], count + 1);
        
        if (i == arr.length - 1) {
            
            if ((arr.length / 2) - count > 1) 
                return false;

            if ((arr.length / 2) - count == 1) 
                return equalSplit(arr, i + 1, sum - arr[i], count + 1);
        }

        return equalSplit(arr, i + 1, sum - arr[i], count + 1) || equalSplit(arr, i + 1, sum, count);
    }

    private static int sum(int a[], int i) {
        return i == a.length - 1 ? (a[i]) : (a[i] + sum(a, i + 1));
    }

}