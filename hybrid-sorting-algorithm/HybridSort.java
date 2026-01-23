/*
 * K.Q Tawana
 * 29290473
 * 
 * 
*/

public class HybridSort {

    static int QuickSortComparisons = 0;
    static int QuickSortSwaps = 0;
    static int InsertionSortComparisons = 0;
    static int InsertionSortSwaps = 0;

    // Sorting algorith

    public static void QuickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }

    public static void quickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    public static int partition(int[] list, int first, int last) {
        int pivot = list[first];
        int low = first + 1;
        int high = last;

        while (high > low) {

            while (low <= high && list[low] <= pivot) {
                low++;
                QuickSortComparisons++;
            }

            while (low <= high && list[high] > pivot) {
                high--;
                QuickSortComparisons++;
            }

            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
                QuickSortSwaps++;
            }
        }

        while (high > first && list[high] >= pivot) {
            high--;
            QuickSortComparisons++;
        }

        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            QuickSortSwaps++;
            return high;
        } else {
            return first;
        }
    }

    // InsertionSort Algorithm
    public static void InsertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
                InsertionSortSwaps++;
                InsertionSortComparisons++;
            }
            InsertionSortComparisons++;
            list[k + 1] = currentElement;
        }
    }

    public static void printArray(int[] list) {
        for (int val : list)
            System.out.print(val + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] elements = { 34, 7, 23, 32, 5, 62, 15, 1, 90, 45, 12, 3, 57,
                100, 78, 93, 11, 56, 78, 0, 5, 36 };

        System.out.println("Original Array:");
        printArray(elements);

        // Quick Sort large array
        System.out.println("\n Array of elements after quick sort:");
        QuickSort(elements);
        printArray(elements);

        // Split large array of element into two smaller arrays (0–49 and 50–100)
        int[] small = new int[elements.length];
        int[] large = new int[elements.length];
        int smallCount = 0,
                largeCount = 0;

        for (int val : elements) {
            if (val < 50)
                small[smallCount++] = val;
            else
                large[largeCount++] = val;
        }

        int[] smallArray = new int[smallCount];
        int[] largeArray = new int[largeCount];
        System.arraycopy(small, 0, smallArray, 0, smallCount);
        System.arraycopy(large, 0, largeArray, 0, largeCount);

        // Sorting smaller arrays using Insertion Sort
        InsertionSort(smallArray);
        InsertionSort(largeArray);

        System.out.println("\nSorted Small Array (0–49):");
        printArray(smallArray);

        System.out.println("Sorted Large Array (50–100):");
        printArray(largeArray);

        // swaps and comparisons count
        System.out.println("\n---------- Swaps and Comparisons count ----------");
        System.out.println("QuickSort_Comparisons: " + QuickSortComparisons);
        System.out.println("QuickSort_Swaps: " + QuickSortSwaps);
        System.out.println("InsertionSort_Comparisons: " + InsertionSortComparisons);
        System.out.println("InsertionSort_Swaps: " + InsertionSortSwaps);

        // Asymptotic analysis
        System.out.println("\n----------ASYMPTOTIC ANALYSIS ----------");
        System.out.println("QuickSort: Best = O(n log n), Average = O(n log n), Worst = O(n^2)");
        System.out.println("InsertionSort: Best = O(n), Average = O(n^2), Worst = O(n^2)");
    }
}
