package com.algorithm.chapter1;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }

        int index = binarySearch(arr, 55);

        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int item) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = arr[mid];
            if (guess == item) {
                return mid;
            }
            if (item < guess) {
                high = mid - 1;
            }
            if (item > guess) {
                low = mid + 1;
            }
        }

        return -1;
    }
}
