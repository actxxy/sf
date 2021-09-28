package zs.search;

public class efsearch {
    public static int efsearch(int[] arr,int target,int low_index,int high_index) {
        if (low_index > high_index) {
            return -1;
        }
        int middle_index = low_index+(high_index-low_index) / 2;
        int middle_value = arr[middle_index];
        System.out.println(String.valueOf(middle_index) +":" + String.valueOf(middle_value));
        if (target > middle_value) {
            low_index = low_index+1;
            return efsearch(arr, target, low_index, high_index);
        } else if(target < middle_value){
            high_index = high_index-1;
            return efsearch(arr, target, low_index, high_index);
        }else {
            return middle_index;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 8, 11, 89};
        int target = 100;
        int target_index =  efsearch(arr,target,0,arr.length-1);
        System.out.println(target_index);
    }
}
