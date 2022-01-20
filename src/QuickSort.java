public class QuickSort {

    public static int[] quickSort(int[] arr) {
        return quickSort(arr, 0, arr.length - 1);
    }

    private static int[] quickSort(int[] arr, int lo, int hi) {
        if (lo < hi) {
            int middle = partition(arr, lo, hi);
            quickSort(arr, lo, middle - 1);
            quickSort(arr, middle + 1, hi);
        }

        return arr;
    }

    private static int partition(int[] arr, int lo, int hi) {
        int left = lo;
        int right = hi;
        int pivot = arr[lo];

        while (left < right) {
            while (left < right && arr[left] <= pivot) 
                left++;
            while (arr[right] > pivot) 
                right--;
            if (left < right) 
                swap(arr, left, right);
        }
        
        swap(arr, lo, right);
        return right;
    }

    private static void swap(int[] arr, int lo, int hi) {
        int temp = arr[hi];
        arr[hi] = arr[lo];
        arr[lo] = temp;
    }
}
