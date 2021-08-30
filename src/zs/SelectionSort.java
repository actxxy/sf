package zs;

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

    public static void swap(int[] arr, int i, int minIndex) {

    }
    public static void main(String[] args) {

    }
}
