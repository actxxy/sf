package zs.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 两两排序，大的靠前
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 6, 9, 7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
