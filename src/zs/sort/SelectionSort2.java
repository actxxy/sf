package zs.sort;

import java.util.Arrays;

/**
 * 选择排序
 * 每一次循环找出最小(大)的元素
 */
public class SelectionSort2 {
    public static void swap(int[] arr,int i,int minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }

    public static void selectionSort(int[] arr) {
        if (arr==null || arr.length <= 1) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j <= arr.length - 1; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 9, 7, 3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
