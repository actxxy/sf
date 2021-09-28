package zs.test;

public class YiHuo {
    public static void main(String[] args) {
        int[] arr = {9, 4, 5, 5, 4, 7, 8, 8, 7};
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a ^= arr[i];
        }
        System.out.println(a);
    }
}
