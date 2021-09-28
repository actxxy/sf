package zs.sort;

import java.util.Arrays;

public class InsertSort {
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j>=0; j--) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 8, 5};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
