package zs.sort;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectionSort {

    public static void selectSort(int arr[]) {
        // 当数组为空或者数据为单个值，跳过
        if (arr == null || arr.length < 2) {
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

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,3,5,6,9,7};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
