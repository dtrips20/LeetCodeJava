package com.deetree.leetcode.editor.en;

public class TestSorts {


    public static void main(String[] args) {
        TestSorts t = new TestSorts();
        //t.MergeSort();
        t.BubbleSort();
    }

    private void MergeSort() {
        int[] array = {3, 4, 5, 6, 1, 2, 8, 9};

        sort(array, 0, array.length - 1);

        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }

    private void sort(int[] arr, int low, int high) {
        if (low < high) {

            int mid = (low + high) / 2;
            sort(arr, 0, mid);
            sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    private void merge(int[] arr, int low, int mid, int high) {
        int leftArraySize = mid - low + 1;
        int rightArraySize = high - mid;

        int[] leftArray = new int[leftArraySize];
        int[] rightArray = new int[rightArraySize];

        //copy all the elements in left array
        for (int i = 0; i < leftArraySize; i++) {
            leftArray[i] = arr[low + i];

        }

        //copy all the elements in right array
        for (int j = 0; j < rightArraySize; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = low;

        while (i < leftArraySize && j < rightArraySize) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < leftArraySize) {
            arr[k++] = leftArray[i++];
        }

        while (j < rightArraySize) {
            arr[k++] = rightArray[j++];
        }

    }

    private void BubbleSort() {
        int[] arr = {2, 1, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }

    private void QuickSort() {


    }

    private int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    void Quicksort(int arr[], int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            Quicksort(arr, low, pi - 1);
            Quicksort(arr, pi + 1, high);
        }
    }
}
